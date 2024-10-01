
public class ContaCorrente extends Conta{

	private double limiteEspecial;
	
	public void depositarValor(double valor) {
		System.out.println("Você depositou R$ "+ valor);
		valor += this.getSaldo();
		this.setSaldo(valor);
	}
	
	public void sacarValor(double valor) {
		if(this.getSaldo() > -limiteEspecial) {
			double temp = this.getSaldo() - valor;
			this.setSaldo(temp);
			System.out.println("Você sacou R$ "+ valor + " logo seu saldo atual é: " + temp);
		} else {
			System.out.println("Você não tem limite disponível para esse valor de saque.");
		}
	}
	
	public void verificarSaldo() {
		System.out.println("Seu saldo é: "+ this.getSaldo());
	}
		
}

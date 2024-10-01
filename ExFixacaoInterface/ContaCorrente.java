
public class ContaCorrente extends Conta{

	private double limiteEspecial;
	
	public void depositarValor(double valor) {
		System.out.println("Voc� depositou R$ "+ valor);
		valor += this.getSaldo();
		this.setSaldo(valor);
	}
	
	public void sacarValor(double valor) {
		if(this.getSaldo() > -limiteEspecial) {
			double temp = this.getSaldo() - valor;
			this.setSaldo(temp);
			System.out.println("Voc� sacou R$ "+ valor + " logo seu saldo atual �: " + temp);
		} else {
			System.out.println("Voc� n�o tem limite dispon�vel para esse valor de saque.");
		}
	}
	
	public void verificarSaldo() {
		System.out.println("Seu saldo �: "+ this.getSaldo());
	}
		
}

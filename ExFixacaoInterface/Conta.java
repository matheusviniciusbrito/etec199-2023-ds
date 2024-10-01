
public abstract class Conta implements OperacoesConta {
	
	private double saldo = 0;
	
	public void verificarSaldo() {
		System.out.println("Seu saldo é de R$ " + saldo);
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	
	
}

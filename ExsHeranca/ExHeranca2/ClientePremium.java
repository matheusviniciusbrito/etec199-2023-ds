
public class ClientePremium extends Cliente {
	
	@Override
	public void calculaDesconto(double preco) {
		double valorDesconto = preco - (preco*0.15);
		System.out.println("Cliente premium tem desconto de 15% porcento logo o preço final fica: " + valorDesconto);
	}
}

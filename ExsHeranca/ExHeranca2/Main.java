import java.util.*;
public class Main {
	public static void main(String[] args) {
		Cliente roger = new Cliente();
		ClientePremium pedro = new ClientePremium();
		
		roger.setNome("Roger");
		roger.setIdade(30);
		roger.setEndereco("Rua A, 123");
		roger.setValor_Pedido(100.0);
		roger.setValor_Promocional(90.0);
		
		pedro.setNome("Pedro");
		pedro.setIdade(35);
		pedro.setEndereco("Rua B, 456");
		pedro.setValor_Pedido(200.0);
		pedro.setValor_Promocional(180.0);
		
		System.out.println("Cliente: " + roger.getNome() + ", Idade: " + roger.getIdade() + ", Endereço: " + roger.getEndereco());
		roger.calculaDesconto(roger.getValor_Pedido());
		
		System.out.println("Cliente Premium: " + pedro.getNome() + ", Idade: " + pedro.getIdade() + ", Endereço: " + pedro.getEndereco());
		pedro.calculaDesconto(pedro.getValor_Pedido());
	}
}

import java.util.*;
public class Main {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		Produto teste1 = new Produto();
		System.out.print("Digite o nome do produto: ");
		teste1.setNome(in.next());
		System.out.print("Digite o preço de custo do produto: ");
		teste1.setPrecoCusto(in.nextDouble());
		System.out.print("Digite o preco de venda do produto: ");
		teste1.setPrecoVenda(in.nextDouble());
		//Fazer o código repetir até o usuario inserir o valor correto
		while(teste1.getPrecoVenda() < teste1.getPrecoCusto()) {
			teste1.setPrecoVenda(in.nextDouble());
		}
		teste1.calcularMargemLucro();
		System.out.println("Produto: " + teste1.getNome());
		System.out.println("A margem de Lucro é de: " + teste1.getMargemLucroPorcentagem() + "%");
		
	}

}

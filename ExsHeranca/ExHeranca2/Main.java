import java.util.*;
public class Main {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Cliente cliente1 = new Cliente();
        ClientePremium cliente2 = new ClientePremium();

        // Definindo os atributos de cliente1
        System.out.print("Insira o nome do cliente1: ");
        cliente1.setNome(in.nextLine());
        System.out.print("Insira a idade do cliente1: ");
        cliente1.setIdade(in.nextInt());
        in.nextLine(); // Consumir a quebra de linha após ler um número
        System.out.print("Insira o endereço do cliente1: ");
        cliente1.setEndereco(in.nextLine());
        System.out.print("Insira o valor do pedido do cliente1: ");
        cliente1.setValor_Pedido(in.nextDouble());
        in.nextLine();
        
        System.out.println();
        
        // Definindo os atributos de cliente2
        System.out.print("Insira o nome do cliente2:");
        cliente2.setNome(in.nextLine());
        System.out.print("Insira a idade do cliente2:");
        cliente2.setIdade(in.nextInt());
        in.nextLine();
        System.out.print("Insira o endereço do cliente2:");
        cliente2.setEndereco(in.nextLine());
        System.out.print("Insira o valor do pedido do cliente2:");
        cliente2.setValor_Pedido(in.nextDouble());

        // Apresentação dos resultados e cálculos
        System.out.println("Cliente: " + cliente1.getNome() + ", Idade: " + cliente1.getIdade() + ", Endereço: " + cliente1.getEndereco());
        cliente1.calculaDesconto(cliente1.getValor_Pedido());
        System.out.println();
        System.out.println("Cliente Premium: " + cliente2.getNome() + ", Idade: " + cliente2.getIdade() + ", Endereço: " + cliente2.getEndereco());
        cliente2.calculaDesconto(cliente2.getValor_Pedido());
        
        in.close();
	}
}

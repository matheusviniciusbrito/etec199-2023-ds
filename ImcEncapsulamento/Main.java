import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String nome;
		int idade;
		double peso, altura;
		
		Imc teste = new Imc();
		System.out.print("Digite seu nome: ");
		nome = in.next();
		teste.setNome(nome);
		System.out.print("Digite sua idade: ");
		idade = in.nextInt();
		teste.setIdade(idade);
		System.out.print("Digite seu peso: ");
		peso = in.nextDouble();
		teste.setPeso(peso);
		System.out.print("Digite sua altura em metros: ");
		altura = in.nextDouble();
		teste.setAltura(altura);
		teste.printFinal();
		
		System.out.println(teste.calcularImc());
		
		Imc teste2 = new Imc();
		System.out.print("Digite seu nome: ");
		nome = in.next();
		teste2.setNome(nome);
		System.out.print("Digite sua idade: ");
		idade = in.nextInt();
		teste2.setIdade(idade);
		System.out.print("Digite seu peso: ");
		peso = in.nextDouble();
		teste2.setPeso(peso);
		System.out.print("Digite sua altura em metros: ");
		altura = in.nextDouble();
		System.out.println();
		teste2.setAltura(altura);		
		System.out.println(teste2.calcularImc());
		teste2.printFinal();
	
		
		in.close();
	}
}

import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		Funcionario pedro = new Funcionario();
		System.out.print("Insira o salario bruto de Pedro: ");
		pedro.salarioBruto = in.nextDouble();
		pedro.salarioLiquido = pedro.calcSalarioLiquido(pedro.salarioBruto);
		System.out.println("O salário liquido de Pedro é: "+pedro.salarioLiquido);
		
		System.out.print("Insira o valor à adicionar no salário de Pedro: ");
		double valor = in.nextDouble();
		pedro.aumentaSalario(valor);
		System.out.println("O sálario líquido de Pedro após reajuste ficou em: "+pedro.salarioLiquido);

		Funcionario vagner = new Funcionario();
		System.out.print("Insira o salario bruto de Vagner: ");
		vagner.salarioBruto = in.nextDouble();
		vagner.salarioLiquido = vagner.calcSalarioLiquido(vagner.salarioBruto);
		System.out.println("O salário liquido de Vagner é: "+vagner.salarioLiquido);
		
		System.out.print("Insira o valor à adicionar no salário de Vagner: ");
		double valor = in.nextDouble();
		vagner.aumentaSalario(valor);
		System.out.println("O sálario líquido de Vagner após reajuste ficou em: "+vagner.salarioLiquido);
	}

}

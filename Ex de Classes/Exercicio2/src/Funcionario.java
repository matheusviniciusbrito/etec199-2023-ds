
public class Funcionario {
	
	String nome;
	double salarioBruto;
	double imposto;
	double salarioLiquido;
	
	
	double calcSalarioLiquido(double salarioBruto) {
		salarioLiquido = salarioBruto - (salarioBruto*0.07);
		
		return salarioLiquido;
	}
	
	double aumentaSalario(double aumenta) {
		
		salarioBruto += aumenta;
		salarioLiquido = salarioBruto - (salarioBruto*0.07);
		
		return salarioLiquido;
	}
}

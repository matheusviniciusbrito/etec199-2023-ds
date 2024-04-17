import java.util.List;
import java.util.ArrayList;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int operacao;
		Calculadora calc = new Calculadora();
		
        System.out.println("Voc� deseja fazer que opera��o, digite 1 para soma de dois numeros, 2 para subtra��o de dois n�meros, 3 para a soma de uma lista de numeros, 4 para a subtra��o de uma lista de numeros: ");
        operacao = in.nextInt();
		
        
        switch(operacao) {
	        case 1:
	        	
	            calc.soma(5, 3);
	            System.out.println("Soma de inteiros: " + calc.getResultado());
	        	break;
	        case 2:
	        	
	        	break;
	        case 3:
	            System.out.println("Soma de uma lista de inteiros. Digite quantos n�meros deseja somar:");
	            int n = in.nextInt();
	            List<Integer> numeros = Arrays.asList(new Integer[n]);
	            System.out.println("Digite os n�meros:");
	            for (int i = 0; i < n; i++) {
	                numeros.set(i, in.nextInt());
	            }
	            System.out.println("Resultado: " + calc.soma(numeros));

	        	break;
	        case 4:
	            System.out.println("Subtra��o de uma lista de inteiros. Digite quantos n�meros deseja subtrair:");
	            int n = in.nextInt();
	            List<Integer> numeros = Arrays.asList(new Integer[n]);
	            System.out.println("Digite os n�meros:");
	            for (int i = 0; i < n; i++) {
	                numeros.set(i, in.nextInt());
	            }
	            System.out.println("Resultado: " + calc.soma(numeros));
	        	
	        	break;
        }

		
	}

}

import java.util.ArrayList;
import java.util.List;
public class Calculadora {
	
    private String nome;
    private double resultado;
    
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public double getResultado() {
        return resultado;
    }
    
    public void setResultado(double resultado) {
        this.resultado = resultado;
    }
    
    // Metodo de soma inteiros e decimais
    public void soma(int n1, int n2) {
        resultado = n1 + n2;
    }
    public void soma(double n1, double n2){
        resultado = n1 + n2;
    }
    
    public int soma(List<Integer> numeros) {
        int sum = 0;
        for (int num : numeros) {
            sum += num;
        }
        return sum;
    }
    
    //Metodo de subtração inteiros e decimais
    public void subtracao(int n1, int n2){
        resultado = n1 - n2;
    }
    public void subtracao(double n1, double n2){
        resultado = n1 - n2;
    }
    
    public int subtracao(List<Integer> numeros) {
        int sub = 0;
        for (int num : numeros) {
        	sub -= num;
        }
        return sub;
    }
    
    
	
}

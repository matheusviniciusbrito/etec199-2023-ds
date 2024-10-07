
public class Main {
    public static void main(String[] args) {
    	
        ContaCorrente contaCorrente = new ContaCorrente(1000, 500);
        System.out.println("---- Testando Conta Corrente ----");
        
        contaCorrente.verificarSaldo();
        
        // deposito de 200
        contaCorrente.depositarValor(200);
        contaCorrente.verificarSaldo(); //1200 saldo atual
        
        // saque de 500
        contaCorrente.sacarValor(500);
        contaCorrente.verificarSaldo(); // 700
        
        // tentando sacar além do saldo + limite especial (saque de 1500)
        contaCorrente.sacarValor(1500); //tem que falar que sacou só 1300
        contaCorrente.verificarSaldo(); //tem que falar -500
        
        ContaPoupanca contaPoupanca = new ContaPoupanca(1500);
        System.out.println("\n---- Testando Conta Poupança ----");
        
        
        contaPoupanca.verificarSaldo(); //tem que falar 1500
        
        // Depositando 300 na Conta Poupança
        contaPoupanca.depositarValor(300);
        contaPoupanca.verificarSaldo(); //1800
        
        // Sacando 700 da Conta Poupança
        contaPoupanca.sacarValor(700);
        contaPoupanca.verificarSaldo(); //1100
        
        // Aplicando uma taxa de rendimento de 2% (0.02)
        contaPoupanca.aplicarTaxa(0.02); // 1100 + 2% = 1122
        contaPoupanca.verificarSaldo();
    }
}

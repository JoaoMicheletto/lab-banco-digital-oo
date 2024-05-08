import contas.*;

public class Main {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente();
        ContaPoupanca poupanca = new ContaPoupanca();
        
        cc.depositar(100);
        cc.transferir(20, poupanca);
        
        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}

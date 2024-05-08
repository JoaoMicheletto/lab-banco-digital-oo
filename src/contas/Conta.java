package contas;

public abstract class Conta {
    private static int SEQUENCIAL = 1;
    private static int AGENCIA_PADRAO = 0001;

    protected int numeroConta;
    protected int agenciaConta;
    protected double saldoConta;

    public Conta() {
        this.numeroConta = SEQUENCIAL++;
        this.agenciaConta = AGENCIA_PADRAO;
    }

    public void sacar (double valor) {
        saldoConta -= valor;
    }

    public void depositar (double valor) {
        saldoConta += valor;
    }

    public void transferir (double valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    protected void imprimirInfoExtrato() {
        System.out.printf("Número: %d\n", this.numeroConta);
        System.out.printf("Agencia: %d\n", this.agenciaConta);
        System.out.printf("Valor: %.2f\n", this.saldoConta);
    }
}


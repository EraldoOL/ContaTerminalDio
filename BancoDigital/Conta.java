

public class Conta {
    private String titular;
    private double saldo;

    public Conta(String titular, double saldoInicial) {
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
        }
    }

    public void sacar(double valor) {
        if (valor > 0 && saldo >= valor) {
            saldo -= valor;
        }
    }

    public void transferir(double valor, Conta contaDestino) {
        if (valor > 0 && saldo >= valor) {
            saldo -= valor;
            contaDestino.depositar(valor);
        }
    }

    public void exibirExtrato() {
        System.out.println("Titular: " + titular);
        System.out.println("Saldo: R$ " + saldo);
    }
}


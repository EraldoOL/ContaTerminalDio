import java.util.Scanner;

public class ContaBancaria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o saldo inicial da conta: ");
        double saldoInicial = scanner.nextDouble();

        System.out.print("Digite o valor da primeira transação (positivo para depósito, negativo para saque): ");
        double transacao1 = scanner.nextDouble();

        System.out.print("Digite o valor da segunda transação (positivo para depósito, negativo para saque): ");
        double transacao2 = scanner.nextDouble();

        System.out.print("Digite o valor da terceira transação (positivo para depósito, negativo para saque): ");
        double transacao3 = scanner.nextDouble();

        double saldoFinal = saldoInicial + transacao1 + transacao2 + transacao3;

        System.out.println("O saldo final é: R$ " + saldoFinal);

        scanner.close();
    }
}

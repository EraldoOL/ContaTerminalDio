import java.util.Scanner;

public class ContaBancaria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldo = 0;

        while (true) {
            System.out.println("\nSaldo atual: R$ " + saldo);
            System.out.println("Escolha uma opção:");
            System.out.println("1 - Depositar");
            System.out.println("2 - Sacar");
            System.out.println("3 - Sair");
            int opcao = scanner.nextInt();

            if (opcao == 1) {
                System.out.print("Digite o valor para depósito: R$ ");
                double valor = scanner.nextDouble();
                saldo += valor;
                System.out.println("Depósito realizado. Novo saldo: R$ " + saldo);
            } else if (opcao == 2) {
                System.out.print("Digite o valor para saque: R$ ");
                double valor = scanner.nextDouble();
                if (valor > saldo) {
                    System.out.println("Saldo insuficiente. Adicione mais dinheiro.");
                } else {
                    saldo -= valor;
                    System.out.println("Saque realizado. Novo saldo: R$ " + saldo);
                }
            } else if (opcao == 3) {
                System.out.println("Encerrando o sistema...");
                break;
            } else {
                System.out.println("Opção inválida. Tente novamente.");
            }
        }
        scanner.close();
    }
}

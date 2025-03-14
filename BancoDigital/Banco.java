import java.util.Scanner;

public class Banco {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Conta conta1 = new Conta("João", 1000);
        Conta conta2 = new Conta("Maria", 500);

        while (true) {
            System.out.println("Escolha uma opção:");
            System.out.println("1 - Depósito");
            System.out.println("2 - Saque");
            System.out.println("3 - Transferência");
            System.out.println("4 - Extrato");
            System.out.println("5 - Sair");

            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Digite o valor para depósito:");
                    double valorDeposito = scanner.nextDouble();
                    conta1.depositar(valorDeposito);
                    break;

                case 2:
                    System.out.println("Digite o valor para saque:");
                    double valorSaque = scanner.nextDouble();
                    conta1.sacar(valorSaque);
                    break;

                case 3:
                    System.out.println("Digite o valor para transferência:");
                    double valorTransferencia = scanner.nextDouble();
                    conta1.transferir(valorTransferencia, conta2);
                    break;

                case 4:
                    conta1.exibirExtrato();
                    break;

                case 5:
                    System.out.println("Saindo...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Opção inválida!");
            }
        }
    }
}

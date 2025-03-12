import java.util.*;

public class ValidarCandidatos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Criação da lista de candidatos com nomes e salários fictícios
        List<Candidato> candidatos = new ArrayList<>();
        candidatos.add(new Candidato("João", 2500));
        candidatos.add(new Candidato("Maria", 2700));
        candidatos.add(new Candidato("Carlos", 3000));
        candidatos.add(new Candidato("Ana", 2800));
        candidatos.add(new Candidato("Rafael", 3300));
        candidatos.add(new Candidato("Lucas", 2600));
        candidatos.add(new Candidato("Beatriz", 3200));
        candidatos.add(new Candidato("Renan", 2900));
        candidatos.add(new Candidato("Fernanda", 3100));
        candidatos.add(new Candidato("Paula", 3500));

        // Mostra a lista inicial de candidatos
        System.out.println("Lista de candidatos iniciais:");
        for (Candidato candidato : candidatos) {
            System.out.println(candidato);
        }

        // Lista dos candidatos selecionados
        List<Candidato> selecionados = new ArrayList<>();
        int tentativasMaximas = 3;

        // Loop para simular a seleção dos candidatos
        while (candidatos.size() > 1) {
            System.out.println("\nSeleção da próxima fase...");

            // Mostra os candidatos restantes
            System.out.println("\nCandidatos restantes:");
            for (int i = 0; i < candidatos.size(); i++) {
                System.out.println((i + 1) + ". " + candidatos.get(i));
            }

            System.out.print("Escolha o candidato que vai para a próxima fase (digite o número): ");
            int escolha = scanner.nextInt() - 1;

            if (escolha >= 0 && escolha < candidatos.size()) {
                Candidato candidatoEscolhido = candidatos.get(escolha);

                // Simula a ligação
                System.out.println("\nLigando para " + candidatoEscolhido.getNome() + "...");
                int tentativas = 0;
                boolean atendeu = false;

                while (tentativas < tentativasMaximas && !atendeu) {
                    System.out.print("Tentativa " + (tentativas + 1) + ": " + candidatoEscolhido.getNome() + " atendendo? (S/N): ");
                    String resposta = scanner.next();

                    if (resposta.equalsIgnoreCase("S")) {
                        atendeu = true;
                        System.out.println(candidatoEscolhido.getNome() + " atendeu a ligação!");
                        selecionados.add(candidatoEscolhido);
                        candidatos.remove(escolha); // Remove o candidato da lista
                    } else {
                        tentativas++;
                        if (tentativas == tentativasMaximas) {
                            System.out.println(candidatoEscolhido.getNome() + " não atendeu após " + tentativasMaximas + " tentativas. Candidato foi desclassificado.");
                            candidatos.remove(escolha); // Remove o candidato da lista
                        }
                    }
                }
            } else {
                System.out.println("Opção inválida, tente novamente.");
            }
        }

        // Exibe o candidato final selecionado
        System.out.println("\nCandidato selecionado para a vaga: " + candidatos.get(0).getNome());
    }
}

class Candidato {
    private String nome;
    private double salario;

    // Construtor da classe Candidato
    public Candidato(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + ", Salário: R$ " + salario;
    }
}

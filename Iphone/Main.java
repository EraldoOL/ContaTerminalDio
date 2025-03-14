
interface ReprodutorMusical {
    void tocar();
    void pausar();
    void selecionarMusica(String musica);
}


interface Telefone {
    void ligar(String numero);
    void atender();
    void desligar();
}


interface NavegadorInternet {
    void abrirSite(String url);
    void atualizarPagina();
}


class iPhone implements ReprodutorMusical, Telefone, NavegadorInternet {
    private String modelo;
    private String cor;

    public iPhone(String modelo, String cor) {
        this.modelo = modelo;
        this.cor = cor;
    }

    
    @Override
    public void tocar() {
        System.out.println("Reproduzindo música...");
    }

    @Override
    public void pausar() {
        System.out.println("Música pausada.");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Selecionando música: " + musica);
    }

    
    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para: " + numero);
    }

    @Override
    public void atender() {
        System.out.println("Atendendo chamada...");
    }

    @Override
    public void desligar() {
        System.out.println("Chamada encerrada.");
    }

    
    @Override
    public void abrirSite(String url) {
        System.out.println("Abrindo site: " + url);
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Página atualizada.");
    }
}

public class Main {
    public static void main(String[] args) {
        // Criando um objeto iPhone
        iPhone meuIphone = new iPhone("iPhone 15 Pro", "Titanium");

        // Testando funcionalidades do reprodutor musical
        System.out.println("=== Testando Reprodutor de Música ===");
        meuIphone.tocar();
        meuIphone.selecionarMusica("Link Park - New Divide");
        meuIphone.pausar();

        // Testando funcionalidades do telefone
        System.out.println("\n=== Testando número  ===");
        meuIphone.ligar("99999-1234");
        meuIphone.atender();
        meuIphone.desligar();

        // Testando funcionalidades do navegador
        System.out.println("\n=== Testando Navegador  ===");
        meuIphone.abrirSite("https://www.magalu.com");
        meuIphone.atualizarPagina();
    }
}

public class iPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    @Override
    public void play() {
        System.out.println("Reproduzindo música");
    }

    @Override
    public void pause() {
        System.out.println("Música pausada");
    }

    @Override
    public void stop() {
        System.out.println("Música parada");
    }

    @Override
    public void fazerChamada(String numero) {
        System.out.println("Fazendo chamada para " + numero);
    }

    @Override
    public void atenderChamada() {
        System.out.println("Atendendo chamada");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo página: " + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Nova aba adicionada");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Página atualizada");
    }

    public static void main(String[] args) {
        iPhone meuIPhone = new iPhone();

        // Testando as funcionalidades
        meuIPhone.play();
        meuIPhone.pause();
        meuIPhone.stop();
        meuIPhone.fazerChamada("123456789");
        meuIPhone.atenderChamada();
        meuIPhone.iniciarCorreioVoz();
        meuIPhone.exibirPagina("www.example.com");
        meuIPhone.adicionarNovaAba();
        meuIPhone.atualizarPagina();
    }
}

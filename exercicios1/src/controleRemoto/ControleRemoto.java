package controleRemoto;

public class ControleRemoto implements Controlador {
    private int volume;
    private boolean ligado;
    private boolean tocando;

    // Métodos especiais
    public ControleRemoto() {
        this.volume = 0;
        this.ligado = false;
        this.tocando = false;
    }

    private int getVolume() {
        return volume;
    }

    private void setVolume(int volume) {
        this.volume = volume;
    }

    private boolean isLigado() {
        return ligado;
    }

    private void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    private boolean isTocando() {
        return tocando;
    }

    private void setTocando(boolean tocando) {
        this.tocando = tocando;
    }

    @Override
    public void ligar() {
        this.setLigado(true);
    }

    @Override
    public void desligar() {
        this.setLigado(false);
    }

    @Override
    public void abrirMenu() {
        if (this.isLigado()) {
            System.out.println("Está ligado? " + this.isLigado());
            System.out.println("Está tocando? " + this.isTocando());
            System.out.println("Volume: " + this.getVolume());
            for (int i = 0; i <= this.getVolume(); i += 10) {
                System.out.print("|");
            }
        } else {
            System.out.println("Não foi possivel abrir o Menu");
        }

    }

    @Override
    public void fecharMenu() {
        if(this.isLigado()){
            System.out.println("Fechando Menu...");
        }else{
            System.out.println("Não foi possivel fechar o Menu");
        }
        
    }

    @Override
    public void aumentarVolume() {
        if (isLigado()) {
            setVolume(getVolume() + 10);
        } else {
            System.out.println("Impossivel aumentar o volume");
        }
    }

    @Override
    public void abaixarVolume() {
        if (isLigado()) {
            setVolume(getVolume() - 10);
        } else {
            System.out.println("Impossivel abaixar o volume");
        }
    }

    @Override
    public void ativarMudo() {
        if (isLigado() && getVolume() > 0) {
            this.setVolume(0);

        }
    }

    @Override
    public void desativarMudo() {
        if (isLigado() && getVolume() == 0) {
            this.setVolume(10);
        }
    }

    @Override
    public void play() {
        if (this.isLigado() && !(this.isTocando())) {
            this.setTocando(true);
        } else {
            System.out.println("Não consegui reproduzir");
        }
    }

    @Override
    public void pause() {
        if (this.isLigado() && this.isTocando()) {
            this.setTocando(false);
        } else {
            System.out.println("Não consegui pausar");
        }
    }

}

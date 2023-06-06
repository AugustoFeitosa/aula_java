package controleRemoto;

public interface Controlador {
    //Métodos abstratos
    public abstract void ligar();
    public abstract void desligar();
    public abstract void abrirMenu();
    public abstract void fecharMenu();
    public abstract void aumentarVolume();
    public abstract void abaixarVolume();
    public abstract void ativarMudo();
    public abstract void desativarMudo();
    public abstract void play();
    public abstract void pause();
    
}

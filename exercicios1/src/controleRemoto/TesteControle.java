package controleRemoto;

public class TesteControle {
    public static void main(String[] args) {
        ControleRemoto c = new ControleRemoto();

        c.ligar();
        c.play();
        c.aumentarVolume();
        c.abrirMenu();
    }
    
}

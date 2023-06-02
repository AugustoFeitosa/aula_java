package lojaDeGames;

import lojaDeGames.CadastroGames;

public class Produtos{
    public static void main(String[] args) {
        CadastroGames jogoUm = new CadastroGames("The Last of Us II", 2020, "Playstation 4", "Ação e Aventura", 250.00, 10);

        CadastroGames jogoDois = new CadastroGames("Marvel's Spider-Man: Miles Morales", 2020, "Playstation 5", "Aventura", 150.00, 2);

        jogoUm.getDadosJogo();
        jogoDois.getDadosJogo();
    }

}

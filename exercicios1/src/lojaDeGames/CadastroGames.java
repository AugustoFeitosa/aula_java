package lojaDeGames;

    public class CadastroGames {
        private String nomeJogo;
        private int anoDeLancamento;
        private String plataforma;
        private String genero;
        private double valorDoJogo;
        private int estoque;

        public CadastroGames(String nomeJogo, int anoDeLancamento, String plataforma, String genero, double valorDoJogo, int estoque){
            this.nomeJogo = nomeJogo;
            this.anoDeLancamento = anoDeLancamento;
            this.plataforma = plataforma;
            this.genero = genero;
            this.valorDoJogo = valorDoJogo;
            this.estoque = estoque;
        }

        public void getDadosJogo(){
            System.out.println("Nome: " + nomeJogo);
            System.out.println("Ano de Lançamento: " + anoDeLancamento);
            System.out.println("Plataforma: " + plataforma);
            System.out.println("Gênero: " + genero);
            System.out.println("Valor: " + valorDoJogo);
            System.out.println("Quantidade em Estoque: " + estoque);
            System.out.println("\n");
        }

        public void setNomeJogo(String nomeJogo){
            this.nomeJogo = nomeJogo;
        }

        public void setAnoDeLancamento(int anoDeLancamento){
            this.anoDeLancamento = anoDeLancamento;
        }
        public void setPlataforma(String plataforma){
            this.plataforma = plataforma;
        }
        public void setGenero(String genero){
            this.genero = genero;
        }
        public void setValor(double valorDoJogo){
            this.valorDoJogo = valorDoJogo;
        }
        public void setEstoque(int estoque){
            this.estoque = estoque;
        }
        
        



    }
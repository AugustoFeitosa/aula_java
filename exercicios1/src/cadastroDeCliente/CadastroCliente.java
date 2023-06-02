package cadastroDeCliente;

public class CadastroCliente{
        private String nome;
        private int idade;
        private String sexo;
        private String email;
        private int telefone;
       

        public CadastroCliente(String nome, int idade, String sexo, String email, int telefone){
            this.nome = nome;
            this.idade = idade;
            this.sexo = sexo;
            this.email = email;
            this.telefone = telefone;
           
        }

        public void getDadosCliente(){
            System.out.println("Nome: " + nome);
            System.out.println("Idade: " + idade);
            System.out.println("Sexo: " + sexo);
            System.out.println("E-mail: " + email);
            System.out.println("Telefone: " + telefone);
            System.out.println("\n");
        }

        public void setNome(String nome){
            this.nome = nome;
        }
        public void setIdade(int idade){
            this.idade = idade;
        }
        public void setSexo(String sexo){
            this.sexo = sexo;
        }
        public void setEmail(String email){
            this.email = email;
        }
        public void setTelefone(int telefone){
            this.telefone = telefone;
        }
        


    }
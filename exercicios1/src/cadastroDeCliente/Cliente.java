package cadastroDeCliente;

public class Cliente {
    public static void main(String[] args) {
        CadastroCliente clienteUm = new CadastroCliente("Igor Augusto", 27, "Masculino", "feitosa66@gmail.com", 997783949);

        CadastroCliente clienteDois = new CadastroCliente("Gabriela Guerra", 20, "Feminino", "gabrielaguerra@gmail.com", 910504789);

        clienteUm.getDadosCliente();
        clienteDois.getDadosCliente();
    }
}

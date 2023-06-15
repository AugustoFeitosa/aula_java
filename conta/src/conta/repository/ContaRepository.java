package conta.repository;
import conta.model.Conta;
public interface ContaRepository {
	
	//CRUD da Conta
	public void procurarPorNumero(int numeroConta);
	public void listarTodas();
	public void cadastrar(Conta conta);
	public void atualizar(Conta conta);
	public void deletar(int numeroConta);
	
	//Metodos Bancarios
	
	public void sacar(int numeroConta, float valor);
	public void depositar(int numeroConta, float valor);
	public void transferir(int numeroOrigem, int numeroDestino, float valor);
	

}

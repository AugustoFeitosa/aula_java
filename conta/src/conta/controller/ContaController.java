package conta.controller;

import java.util.ArrayList;

import conta.model.Conta;
import conta.repository.ContaRepository;

public class ContaController implements ContaRepository{

	private ArrayList<Conta> listaConta = new ArrayList<Conta>();
	int numeroConta = 0;
	
	
	@Override
	public void procurarPorNumero(int numero) {
		var conta = buscarNaCollection(numeroConta);
		
		if (conta != null)
			conta.statusConta();
		else
			System.out.println("\n A conta número: " +  numeroConta + " não foi encontrada!");
	}

	@Override
	public void listarTodas() {
		for (var conta : listaConta) {
			conta.statusConta();
		}
		
	}

	@Override
	public void cadastrar(Conta conta) {
		listaConta.add(conta);
		System.out.println("\nA Conta número: " +  conta.getNumeroConta() + " foi criada com sucesso!");
	}
		

	@Override
	public void atualizar(Conta conta) {
		var buscaConta = buscarNaCollection(conta.getNumeroConta());
		
		if(buscaConta != null) {
			listaConta.set(listaConta.indexOf(buscaConta), conta);	
			System.out.println("\nA Conta número: " + conta.getNumeroConta() + " foi atualizada com sucesso!");
			
		}else 
			System.out.println("\nA Conta número: " + conta.getNumeroConta() + " não foi encontrada!");
		
	}

	@Override
	public void deletar(int numeroConta) {
		var conta = buscarNaCollection(numeroConta);
		
		if(conta != null) {
			if(listaConta.remove(conta) == true) {
				System.out.println("\nA conta número: " + numeroConta + " foi deletada com sucesso!");
			}else 
				System.out.println("\nA conta número : " + numeroConta + " não foi encontrada!");
		}
		
	}

	@Override
	public void sacar(int numeroConta, float valor) {
		var buscaNaConta = buscarNaCollection(numeroConta);
		
		if(buscaNaConta != null) {
			if(listaConta.get(listaConta.indexOf(buscaNaConta)).sacar(valor) == true)
				System.out.println("\nO saque na conta número: " + numeroConta + "foi efetuado com sucesso!");
			
		}else 
			System.out.println("\nA conta número: " + numeroConta + " não foi encontrada!");
		
	}

	@Override
	public void depositar(int numeroConta, float valor) {
		var buscaConta = buscarNaCollection(numeroConta);
		
		if(buscaConta != null) {
			var indiceConta = listaConta.indexOf(buscaConta);
			listaConta.get(indiceConta).depositar(valor);
			System.out.println("\nO depósito na conta número: " + numeroConta + " foi efetuado com sucesso");
		}else {
			System.out.println("\nA conta número: " + numeroConta + " não foi encontrada ou a Conta destino não uma conta corrente!");
		}
	}

	@Override
	public void transferir(int numeroOrigem, int numeroDestino, float valor) {
		var buscaContaOrigem = buscarNaCollection(numeroOrigem);
		var buscaContaDestino = buscarNaCollection(numeroDestino);
		
		if (buscaContaOrigem != null && buscaContaDestino != null) {
			if(listaConta.get(listaConta.indexOf(buscaContaOrigem)).sacar(valor) == true) {
				listaConta.get(listaConta.indexOf(buscaContaDestino)).depositar(valor);
				System.out.println("\nA tranferência foi efetuada com sucesso!");
			}else {
				System.out.println("\nA conta de Origem e/ ou conta de Destino não foram encontradas!");
			}
			
		}
		
		
		
	}
	public int gerarNumero() {
		return ++ numeroConta;
	}
	
	public Conta buscarNaCollection(int numeroConta) {
		for (var conta : listaConta) {
			if(conta.getNumeroConta() == numeroConta) {
				return conta;
			}
		}
		return null;
	}
	
	public int retornaTipo(int numeroConta) {
		for(var conta : listaConta) {
			if(conta.getNumeroConta() == numeroConta) {
				return conta.getTipo();
			}
			return 0;
		}
	}

}

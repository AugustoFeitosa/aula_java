package condicionais;

import java.util.Scanner;

public class ContaBancaria {

	public static void main(String[] args) {
		int codigoOperacao;
		float valorSaque, valorDeposito;
		double valorSaldo = 1000.00, novoSaldo;
		
		Scanner leia = new Scanner(System.in);
		System.out.println("        Bem-vindo ao seu Banco!    ");	
		System.out.println("\n  Realize Saques, Depósitos e veja seu Saldo \n");
		System.out.println("         Códigos das Operações                 \n");
		System.out.println("         [1]   Saldo");
		System.out.println("         [2]   Saque ");
		System.out.println("         [3]   Depósito");
		System.out.print("\n  Digite o CODIGO da operação que deseja realizar: ");
		codigoOperacao = leia.nextInt();
		
		
		
		switch(codigoOperacao) {
		
		case 1:
			System.out.println("\n  Você selecionou a [Opção 1] SALDO");
			System.out.print("  Seu saldo disponivel é de ");
			 System.out.printf("%.2f ", valorSaldo);;  
		    break;
		case 2:
			System.out.println("\n  Você selecionou a [Opção 2] SAQUE");
			System.out.print("  Digite o valor do SAQUE: ");
			valorSaque = leia.nextFloat();
			if(valorSaque > valorSaldo) {
				System.out.print("\n  Saldo Insuficiente! Seu SALDO DISPONIVEL é de ");
				 System.out.printf("%.2f ", valorSaldo);
			}else {
				novoSaldo = valorSaldo - valorSaque;
				System.out.print("\n  Saque Autorizado! Seu novo SALDO DISPONIVEL é de ");
				 System.out.printf("%.2f ", novoSaldo);
			}
			
		    break;
		case 3:
			System.out.println("\n  Você selecionou a [Opção 3] DEPÓSITO");
			System.out.print("  Digite o valor do DEPÓSITO: ");
			valorDeposito = leia.nextFloat();
			
			novoSaldo = valorSaldo + valorDeposito;
			System.out.print("  DEPÓSITO realizado com sucesso!");
		    System.out.print("  Seu novo SALDO é de ");
		    System.out.printf("%.2f ", novoSaldo);
		    break;
		default:
			System.out.println("  Operação inválida, Por favor tente novamente :)");
		}
		
		
	}

}

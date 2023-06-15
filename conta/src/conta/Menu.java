package conta;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

import conta.controller.ContaController;
import conta.model.ContaCorrente;
import conta.model.ContaPoupanca;
import contaUtil.Cores;

public class Menu {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		ContaController contas = new ContaController();
		int opcoesMenu;

		int numeroConta, numeroContaDestino, agencia, tipo, aniversario;
		String titular;
		float saldo, limite, valor;
	
		
		while (true) {
			System.out.println(Cores.TEXT_YELLOW_BRIGHT);
			System.out.println(" ______________________________________________________");
			System.out.println("                                                       ");
			System.out.println("\t\t\t BANCO GIGA");
			System.out.println(" ______________________________________________________");
			System.out.println("\n\t\t\t MENU\n");
			System.out.println("\t [1] - Criar Conta ");
			System.out.println("\t [2] - Lista de todas as Contas");
			System.out.println("\t [3] - Buscar Conta por Numero");
			System.out.println("\t [4] - Atualizar Dados da Conta");
			System.out.println("\t [5] - Deletar Conta");
			System.out.println("\t [6] - Sacar");
			System.out.println("\t [7] - Depositar");
			System.out.println("\t [8] - Transferir valores entre Contas");
			System.out.println("\t [9] - Sair");
			System.out.println(" ______________________________________________________");
			System.out.print("\n\tEscolha a opção desejada: ");

			try {
				opcoesMenu = leia.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("\nDigite valores inteiro!");
				leia.nextLine();
				opcoesMenu = 0;
			}

			if (opcoesMenu == 9) {
				System.out.println("\n\tAGRADECEMOS SUA PREFERÊNCIA");
				System.out.println("\t\tEQUIPE GIGA");

				leia.close();
				System.exit(0);
			}

			switch (opcoesMenu) {
			case 1:
				System.out.println(" ______________________________________________________");
				System.out.println("                                                       ");
				System.out.println("\t\t\t Criar Conta");
				System.out.println(" ______________________________________________________");
				System.out.println("                                                       ");
				System.out.println("Digite o número da Agência: ");
				agencia = leia.nextInt();
				System.out.println("Digite o nome da Titular: ");
				leia.skip("\\R?");
				titular = leia.nextLine();
				
				do {
					System.out.print("Digite o Tipo da Conta ([1] - CC ou [2] - CP) :");
					tipo = leia.nextInt();
					
				}while(tipo < 1 && tipo > 2);
				
				System.out.println("Digite o Saldo da Conta (R$): ");
				saldo = leia.nextFloat();
				
				switch(tipo) {
					case 1 -> {
						System.out.println("Digite o limite de Crédito (R$): ");
						limite = leia.nextFloat();
						contas.cadastrar(new ContaCorrente(contas.gerarNumero(), agencia, tipo, titular, saldo, limite));
					}
					
					case 2 -> {
						System.out.println("Digite o dia do Aniversário da Conta: ");
						aniversario = leia.nextInt();
						contas.cadastrar(new ContaPoupanca(contas.gerarNumero(), agencia, tipo, titular, saldo, aniversario));
					}
				
				}
								
				KeyPress();
				break;
				
			case 2:
				System.out.println(" ______________________________________________________");
				System.out.println("                                                       ");
				System.out.println("\t\tLista de todas as Contas");
				System.out.println(" ______________________________________________________");
				System.out.println("                                                       ");
				contas.listarTodas();
				KeyPress();
				break;
			case 3:
				System.out.println(" ______________________________________________________");
				System.out.println("                                                       ");
				System.out.println("\t\tConsultar dados da Conta");
				System.out.println(" ______________________________________________________");
				System.out.println("                                                       ");
				System.out.print("Digite o número da conta: ");
				numeroConta = leia.nextInt();
				contas.procurarPorNumero(numeroConta);
				KeyPress();
				break;
			case 4:
				System.out.println(" ______________________________________________________");
				System.out.println("                                                       ");
				System.out.println("\t\tAtualizar dados da Conta");
				System.out.println(" ______________________________________________________");
				System.out.println("                                                       ");
				System.out.print("Digite o número da conta: ");
				numeroConta = leia.nextInt();
				
				if(contas.buscarNaCollection(numeroConta) != null) {
					System.out.print("Digite o número da Agência: ");
					agencia = leia.nextInt();
					System.out.print("Digite o nome do Titular: ");
					leia.skip("\\R?");
					titular = leia.nextLine();
					
					System.out.println("Digite o Saldo da Conta (R$): ");
					saldo = leia.nextFloat();
					
					tipo = contas.retornaTipo(numeroConta);
					
					switch (tipo) {
					
					case 1 -> {
						System.out.print("Digite o limite de crédito (R$): ");
						limite = leia.nextFloat();
						contas.atualizar(new ContaCorrente(numeroConta, agencia, tipo, titular, saldo, limite));
						
					}
					case 2 -> {
						System.out.print("Digite o dia do Aniversário da Conta: ");
						aniversario = leia.nextInt();
						contas.atualizar(new ContaPoupanca(numeroConta, agencia, tipo, titular, saldo, aniversario));
						
					}
					
					default -> {
						System.out.println("Tipo de conta inválido!");
					}
					
				}
					
				} else
					System.out.println("Conta não encontrada!");
				
				KeyPress();
				break;
			case 5:
				System.out.println(" ______________________________________________________");
				System.out.println("                                                       ");
				System.out.println("\t\t\tDeletar a Conta");
				System.out.println(" ______________________________________________________");
				System.out.println("                                                       ");
				
				System.out.print("Digite o número da conta: ");
				numeroConta = leia.nextInt();
				
				contas.deletar(numeroConta);
				KeyPress();
				break;
			case 6:
				System.out.println(" ______________________________________________________");
				System.out.println("                                                       ");
				System.out.println("\t\t\tSaque");
				System.out.println(" ______________________________________________________");
				System.out.println("                                                       ");
				System.out.println("Digite o número da conta: ");
				numeroConta = leia.nextInt();
				
				do {
					System.out.println("Digite o valor do saque (R$): ");
					valor = leia.nextFloat();
				}while(valor <=0);
				
				contas.sacar(numeroConta, valor);
				
				KeyPress();
				break;
			case 7:
				System.out.println(" ______________________________________________________");
				System.out.println("                                                       ");
				System.out.println("\t\t\tDepósito");
				System.out.println(" ______________________________________________________");
				System.out.println("                                                       ");
				System.out.println("Digite o número da conta: ");
				numeroConta = leia.nextInt();
				
				do {
					System.out.println("Digite o valor do depósito (R$): ");
					valor = leia.nextFloat();
					
				}while(valor <= 0);
				
				contas.depositar(numeroConta, valor);
				
				KeyPress();
				break;
			case 8:
				System.out.println(" ______________________________________________________");
				System.out.println("                                                       ");
				System.out.println("\t\tTransferência entre Contas");
				System.out.println(" ______________________________________________________");
				System.out.println("                                                       ");
				
				System.out.println("Digite o número da conta de origem: ");
				numeroConta = leia.nextInt();
				System.out.println("Digite o número da conta de destino: ");
				numeroContaDestino = leia.nextInt();
				
				do {
					System.out.println("Digite o valor da transferência (R$): ");
					valor = leia.nextFloat();
					
					
				}while(valor <= 0);
				
				contas.transferir(numeroConta, numeroContaDestino, valor);
				
				KeyPress();
				break;
			default:
				System.out.println("\n\t\tOpção Invalida!\n");
				KeyPress();
				break;
			}

		}

	}

	public static void KeyPress() {
		try {
			System.out.println(Cores.TEXT_RESET + "\n\nPressione Enter para Continuar ...");
			System.in.read();
		} catch (IOException e) {
			System.out.println("Você pressionou uma tecla diferente de enter!");
		}
	}

}

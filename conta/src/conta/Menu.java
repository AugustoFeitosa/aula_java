package conta;

import java.util.Scanner;
import conta.util.Cores;
public class Menu {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int opcoesMenu;

		while (true) {
			System.out.println(Cores.TEXT_YELLOW_BRIGHT);
			System.out.println(" ______________________________________________________");
			System.out.println("                                                       ");
			System.out.println("\t\t BANCO NACIONAL GENERATION");
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
			opcoesMenu = leia.nextInt();
			

			

			if (opcoesMenu == 9) {
				System.out.println("\n\tAGRADECEMOS SUA PREFERÊNCIA");
				System.out.println("\t\tEQUIPE BNG");
				
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

				break;
			case 2:
				System.out.println(" ______________________________________________________");
				System.out.println("                                                       ");
				System.out.println("\t\tLista de todas as Contas");
				System.out.println(" ______________________________________________________");
				System.out.println("                                                       ");


				break;
			case 3:
				System.out.println(" ______________________________________________________");
				System.out.println("                                                       ");
				System.out.println("\t\tConsultar dados da Conta");
				System.out.println(" ______________________________________________________");
				System.out.println("                                                       ");

				break;
			case 4:
				System.out.println(" ______________________________________________________");
				System.out.println("                                                       ");
				System.out.println("\t\tAtualizar dados da Conta");
				System.out.println(" ______________________________________________________");
				System.out.println("                                                       ");

				break;
			case 5:
				System.out.println(" ______________________________________________________");
				System.out.println("                                                       ");
				System.out.println("\t\t\tDeletar a Conta");
				System.out.println(" ______________________________________________________");
				System.out.println("                                                       ");

				break;
			case 6:
				System.out.println(" ______________________________________________________");
				System.out.println("                                                       ");
				System.out.println("\t\t\tSaque");
				System.out.println(" ______________________________________________________");
				System.out.println("                                                       ");

				break;
			case 7:
				System.out.println(" ______________________________________________________");
				System.out.println("                                                       ");
				System.out.println("\t\t\tDepósito");
				System.out.println(" ______________________________________________________");
				System.out.println("                                                       ");

				break;
			case 8:
				System.out.println(" ______________________________________________________");
				System.out.println("                                                       ");
				System.out.println("\t\tTransferência entre Contas");
				System.out.println(" ______________________________________________________");
				System.out.println("                                                       ");
				break;
			default:
				System.out.println("\n\t\tOpção Inválida!\n");
				break;
			}

		}

		
	}

}

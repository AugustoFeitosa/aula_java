package aulaCollections;

import java.util.Scanner;
import java.util.Stack;

public class AulaDePilhas {

	public static void main(String[] args) {
		Stack<String> pilha = new Stack<String>();
		Scanner leia = new Scanner(System.in);
		String livros;
		int sair = 1, escolhaUsuario;

		System.out.println("*******************************************************\n");
		System.out.println("\t\t\tLeitura Mensal");
		System.out.println("\n\t[1] - Adicionar Livro na Pilha");
		System.out.println("\t[2] - Listar todos os livros");
		System.out.println("\t[3] - Retirar Livros da Pilha");
		System.out.println("\t[0] - Sair");
		System.out.println("\n*******************************************************");

		while (sair == 1) {

			System.out.print("\tEscolha a OPÇÃO desejada: ");
			escolhaUsuario = leia.nextInt();

			switch (escolhaUsuario) {

			case 1:
				System.out.print("\n\tNome do Livro: ");
				leia.nextLine();
				livros = leia.nextLine();
				pilha.push(livros);
				System.out.println("\tO Livro " + livros + " foi adicionado a Pilha\n");
				break;

			case 2:
				System.out.print("\tLista de Livros na Pilha: ");
				System.out.println(pilha + "\n");
				break;

			case 3:
				if (pilha.isEmpty()) {
					System.out.println("\tA Pilha de Leitura Mensal está vazia!");
				} else {
					System.out.print("\t" + pilha.pop());
					System.out.print(" acabou de ser Lido");
				
					System.out.println("\n\tPilha de Livros atualizada: " + pilha + "\n");
				}

				break;

			case 0:
				System.out.println("\tO programa foi finalizado com sucesso! ");
				sair = 0;
				break;

			default:
				System.out.print("\tSelecione uma OPÇÃO VALIDA!\n");

			}

		}

	}
}

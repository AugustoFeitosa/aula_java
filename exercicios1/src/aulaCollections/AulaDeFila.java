package aulaCollections;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class AulaDeFila {

	public static void main(String[] args) {
		Queue<String> fila = new LinkedList<String>();
		Scanner leia = new Scanner(System.in);
		int sair = 1, opcaoDoUsuario;
		String paciente;

		System.out.println("*******************************************************\n");
		System.out.println("\t\t\tFILA DO SUS");
		System.out.println("\n\t[1] - Adicionar Paciente na fila");
		System.out.println("\t[2] - Listar todos os Pacientes na Fila");
		System.out.println("\t[3] - Retirar Paciente da fila");
		System.out.println("\t[0] - Sair");
		System.out.println("\n*******************************************************");

		while (sair == 1) {

			System.out.print("\tEscolha a opção desejada: ");
			opcaoDoUsuario = leia.nextInt();

			switch (opcaoDoUsuario) {

			case 1:
				System.out.print("\tNome do novo Paciente: ");
				leia.nextLine();
				paciente = leia.next();
				fila.add(paciente);
				System.out.println("\t" + paciente + " foi adicionado(a) a Fila de Pacientes!\n");
				break;

			case 2:
				System.out.println("\tLista de Pacientes na Fila: ");
				System.out.println("\t" + fila + "\n");
				break;

			case 3:
				if (fila.isEmpty()) {
					System.out.println("\tA Fila está vazia!");
				} else {
					System.out.print("\tPaciente foi Atendido: ");
					System.out.print(fila.poll());
					System.out.println("\n\tFila de Paciente atualizada: " + fila + "\n");
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

		leia.close();

	}

}

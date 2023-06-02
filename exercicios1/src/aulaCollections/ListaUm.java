package aulaCollections;

import java.util.ArrayList;
import java.util.Scanner;

public class ListaUm {

	public static void main(String[] args) {
		ArrayList<String> cores = new ArrayList<String>();
		Scanner leia = new Scanner(System.in);
		String cor;

		for (int contador = 1; contador <= 5; contador++) {
			System.out.print("Digite a " + contador + "° cor: ");
			cor = leia.next();
			cores.add(cor);
		}
		System.out.print("\nListar todas as cores: ");
		System.out.print(cores);
		cores.sort(null);
		System.out.print("\nOrdenar as cores: ");
		System.out.print(cores);

		leia.close();
	}
}

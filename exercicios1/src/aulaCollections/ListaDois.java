package aulaCollections;

import java.util.ArrayList;
import java.util.Scanner;

public class ListaDois {

	public static void main(String[] args) {
		ArrayList<Integer> numeros = new ArrayList<Integer>() {
			{
				add(2);
				add(5);
				add(1);
				add(3);
				add(4);
				add(9);
				add(7);
				add(8);
				add(10);
				add(6);
			}
		};

		Scanner leia = new Scanner(System.in);
		Integer numeroDigitado;

		System.out.print("Digite o número que você deseja encontrar: ");
		numeroDigitado = leia.nextInt();

		if (numeros.contains(numeroDigitado)) {
			System.out.println(
					"\nO número " + numeroDigitado + " está localizado na posição: " + numeros.indexOf(numeroDigitado));

		} else {
			System.out.println("O número " + numeroDigitado + " não foi encontrado!");
		}

		leia.close();
	}

}

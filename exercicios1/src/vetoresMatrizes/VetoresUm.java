package vetoresMatrizes;

import java.util.Scanner;

public class VetoresUm {

	public static void main(String[] args) {
		int vetor[] = { 2, 5, 1, 3, 4, 9, 7, 8, 10, 6 }, numeroDigitado;
		boolean numeroValido = false;

		Scanner leia = new Scanner(System.in);
		System.out.print("Digite o número que você deseja encontrar: ");
		numeroDigitado = leia.nextInt();

		
		
		for (int indice = 0; indice < vetor.length; indice++) {
			if (numeroDigitado == vetor[indice]) {
				System.out.println("O número " + numeroDigitado + " está localizado na posição: " + indice + ".");
				numeroValido = true;
			}

		}
		if(numeroValido == false) {
			System.out.println("O número " + numeroDigitado + " não foi encontrado!");
		}
		
		leia.close();

	}
}

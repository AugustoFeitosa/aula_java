package repeticao;

import java.util.Scanner;

public class MultiploTresCinco {

	public static void main(String[] args) {
		int primeiroNumero, ultimoNumero, contador;
		Scanner leia = new Scanner(System.in);

		System.out.print("Digite o primeiro número do intervalo: ");
		primeiroNumero = leia.nextInt();

		System.out.print("Digite o ultimo número do intervalo: ");
		ultimoNumero = leia.nextInt();

		if (primeiroNumero >= ultimoNumero) {
			System.out.println("Intervalo inválido!");

		} else {
			System.out.println("No intervalo entre " + primeiroNumero + " e " + ultimoNumero + ":");

			for (contador = primeiroNumero; contador <= ultimoNumero; contador++) {

				if (contador % 3 == 0 && contador % 5 == 0) {
					System.out.println(contador + " é múltiplo de 3 e 5");
				}
			}

		}
		leia.close();
	}

}

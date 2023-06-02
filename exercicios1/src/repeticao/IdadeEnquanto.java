package repeticao;

import java.util.Scanner;

public class IdadeEnquanto {

	public static void main(String[] args) {
		int idade = 1, idadeMenor = 0, idadeMaior = 0;

		Scanner leia = new Scanner(System.in);

		while (idade > 0) {

			System.out.print("Digite uma idade: ");
			idade = leia.nextInt();

			if (idade > 0) {
				if (idade < 21) {
					idadeMenor = idadeMenor + 1;
				} else if (idade > 50) {
					idadeMaior = idadeMaior + 1;
				}

			}

		}
		
		System.out.println("Total de pessoas menores de 21 anos: " + idadeMenor);
		System.out.println("Total de pessoas maiores de 50 anos: " + idadeMaior);
		
		leia.close();
	}

}

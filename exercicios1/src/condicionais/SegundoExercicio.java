package condicionais;

import java.util.Scanner;

public class SegundoExercicio {

	public static void main(String[] args) {
		int valorUm;
		Scanner leia = new Scanner(System.in);
		System.out.println("Descubra se um número é par ou impar, e se é positivo ou negativo!");

		System.out.print("Digite um número: ");
		valorUm = leia.nextInt();

		if (valorUm % 2 == 0) {
			System.out.print("O número " + valorUm + " é par");
			if (valorUm > 0) {
				System.out.print(", e positivo!");
			} else {
				System.out.print(", e negativo!");
			}

		} else if (valorUm % 2 != 0) {
			System.out.print("O número " + valorUm + " é impar");
			if (valorUm > 0) {
				System.out.print(", e positivo!");
			} else {
				System.out.print(", e negativo!");
			}
		}
		leia.close();
	}

}

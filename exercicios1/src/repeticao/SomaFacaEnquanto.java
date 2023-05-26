package repeticao;

import java.util.Scanner;

public class SomaFacaEnquanto {

	public static void main(String[] args) {
		int numero, soma = 0;
		
		Scanner leia = new Scanner(System.in);
		
		do {
			System.out.print("Digite um numero: ");
			numero = leia.nextInt();
			
			if(numero > 0) {
				soma = soma + (numero);
			}
			
			
			
		}while(numero != 0);

		System.out.println("A soma dos números positivos é " + soma);
	}

}

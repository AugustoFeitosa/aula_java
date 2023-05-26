package repeticao;

import java.util.Scanner;

public class MediaMultiplosTres {

	public static void main(String[] args) {
		int numero, contador = 0;
		float media = 0, soma = 0;
		
		Scanner leia = new Scanner(System.in);
		
		do {
			System.out.print("Digite um numero: ");
			numero = leia.nextInt();
			
			if(numero % 3 == 0 && numero > 0) {
				soma = soma + (numero);	
				contador = contador + 1;
			}
			
			
			
		}while(numero != 0);

		media = soma/contador;
		System.out.println("A soma dos números positivos é " + media);

	}

}

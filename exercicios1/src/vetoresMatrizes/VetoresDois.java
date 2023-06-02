package vetoresMatrizes;


import java.util.Scanner;

public class VetoresDois {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int numerosDigitados[] = new int[10], soma = 0;
		float media;
		
		for(int indice = 0; indice < 10; indice++) {
			System.out.print("Digite o " + (indice + 1) + "° número: ");
			numerosDigitados[indice] = leia.nextInt();
			soma += numerosDigitados[indice];
		}
		System.out.println("\nElementos nos índices ímpares: ");
		for(int indice = 1; indice < 10; indice += 2) {
			System.out.print(numerosDigitados[indice]+ ",");
			
		}
		System.out.println("\nElementos pares: ");
		for(int indice = 0; indice < 10; indice++ ) {
			if(numerosDigitados[indice] % 2 ==0 ) {
				System.out.print(numerosDigitados[indice] + ",");
			}
			
		}
		media = soma / numerosDigitados.length;
		
	 System.out.println("\nSoma: " + soma);
	 System.out.printf("Média: %.2f" , media);
	 
	 leia.close();
	}

}

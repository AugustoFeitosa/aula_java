package repeticao;

import java.util.Scanner;

public class QuantidadeParImpar {

	public static void main(String[] args) {
		int numero, numeroPar = 0, numeroImpar = 0;
		
		Scanner leia = new Scanner(System.in);
		
		for(int contador = 1; contador <=10; contador++) {
			System.out.print("Digite o " + contador + "° número: ");
			numero = leia.nextInt();
			
			if(numero % 2 == 0) {
				numeroPar = numeroPar + 1;
			}else {
				numeroImpar = numeroImpar + 1;
			}
		}
		
		System.out.println("\nO total de número PARES: " + numeroPar);
		System.out.println("O total de número IMPARES: " + numeroImpar);
	
	}

}

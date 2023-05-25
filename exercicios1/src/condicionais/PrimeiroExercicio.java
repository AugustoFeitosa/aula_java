package condicionais;

import java.util.Scanner;
public class PrimeiroExercicio {

	public static void main(String[] args) {
		int valorUm, valorDois, valorTres, soma;
		
		Scanner leia = new Scanner(System.in);
		System.out.println("Informe os valores no campo abaixo");
		
		System.out.println("Digite o primeiro valor: ");
		valorUm = leia.nextInt();

		System.out.println("Digite o segundo valor:");
		valorDois = leia.nextInt();
		
		System.out.println("Digite o terceiro valor:");
		valorTres = leia.nextInt();
		
		soma = valorUm + valorDois;
		
		if(soma > valorTres) {
			
			System.out.println("A soma entre " + valorUm + " e " + valorDois + " é maior do que " + valorTres);
		}
		else if(soma < valorTres) {
			
			System.out.println("A soma entre " + valorUm + " e " + valorDois + " é menor do que " + valorTres);
		}
		else {
			System.out.println("A soma entre " + valorUm + " e " + valorDois + " é igual a " + valorTres);
		}
	}

}

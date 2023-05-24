package calcule_diferenca;

import java.util.Scanner;

public class CalculeDiferença {

	public static void main(String[] args) {
		float primeiroValor, segundoValor, terceiroValor, quartoValor, difValor; 
		
		
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Seja bem-vindo ao Calcule a diferença!");
		System.out.print("\n ");
		System.out.print("\nInsira quatro valores abaixo!");
		
		System.out.print("\nPrimeiro valor: ");
		primeiroValor = leia.nextFloat();
		
		System.out.print("\nSegundo valor: ");
		segundoValor = leia.nextFloat();
		
		System.out.print("\nTerceiro valor: ");
		terceiroValor = leia.nextFloat();
		
		System.out.print("\nQuarto valor: ");
		quartoValor = leia.nextFloat();
		
		difValor = (primeiroValor * segundoValor) - (terceiroValor * quartoValor);
		
		System.out.print("\nO Calculo que realizamos foi: (primeiro valor * segundo valor)-(terceiro valor * quarto valor)");
		System.out.print("O valor da diferença é igual a:\n");
		System.out.printf("%.1f ", difValor);


	}

}

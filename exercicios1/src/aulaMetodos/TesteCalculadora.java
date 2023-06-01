package aulaMetodos;

import java.util.Scanner;
public class TesteCalculadora {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		float numUm, numDois;
		
		
		//Entradas de valores para o cálculo
		System.out.println("Sua Calculadora foi iniciada\n");
		System.out.print("Digite o primeiro número: ");
		numUm = leia.nextFloat();
		
		System.out.print("Digite O segundo número: ");
		numDois = leia.nextFloat();
		
		//Exibe o resultado dos cálculos
		System.out.println("\nResultados: ");
		System.out.println("Soma = " + Calculadora.somar(numUm, numDois));
		System.out.println("Subtração = " + Calculadora.subtrair(numUm, numDois));
		System.out.println("Multiplicação = " + Calculadora.multiplicar(numUm, numDois));
		System.out.println("Divisão = " + Calculadora.dividir(numUm, numDois));
		
		leia.close();
	}

}

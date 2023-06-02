package condicionais;

import java.util.Scanner;

public class CalculadoraSimples {

	public static void main(String[] args) {
		int codigoCalculo;
		float numUm, numDois, totalCalculo;
		
		Scanner leia = new Scanner(System.in);
		System.out.println("      Bem-vindo a sua Calculadora Simples     ");	
		System.out.println("\n SOMA | SUBTRAÇÃO | MULTIPLICAÇÃO | DIVISÃO \n");
		System.out.println("         Códigos das Operações                 \n");
		System.out.println("         [1]   Soma");
		System.out.println("         [2]   Subtração ");
		System.out.println("         [3]   Multiplicação");
		System.out.println("         [4]   Divisão");
		System.out.print("\n Digite o CODIGO da operação que deseja calcular: ");
		codigoCalculo = leia.nextInt();
		System.out.println("\n Digite DOIS valores que deseja calcular: ");
		System.out.print(" Primeiro valor: ");
		numUm = leia.nextFloat();
		System.out.print(" Segundo valor: ");
		numDois = leia.nextFloat();
		
		
		switch(codigoCalculo) {
		
		case 1:
			totalCalculo = numUm + numDois;
			System.out.print(" A operação escolhida foi de SOMA");
		    System.out.print("\n Resultado: " + numUm + " + " + numDois + " = ");
		    System.out.printf("%.1f ", totalCalculo);
		    break;
		case 2:
			totalCalculo = numUm - numDois;
			System.out.print(" A operação escolhida foi de SUBTRAÇÃO");
		    System.out.print("\n Resultado: " + numUm + " - " + numDois + " = ");
		    System.out.printf("%.1f ", totalCalculo);
		    break;
		case 3:
			totalCalculo = numUm * numDois;
			System.out.print(" A operação escolhida foi de MULTIPLICAÇÃO");
		    System.out.print("\n Resultado: " + numUm + " X " + numDois + " = ");
		    System.out.printf("%.1f ", totalCalculo);
		    break;
		case 4:
			totalCalculo = numUm / numDois;
			System.out.print(" A operação escolhida foi de DIVISÃO");
		    System.out.print("\n Resultado: " + numUm + " / " + numDois + " = ");
		    System.out.printf("%.1f ", totalCalculo);
		    break;
		default:
			System.out.println(" Operação inválida, Por favor tente novamente :)");
		}
		leia.close();
	}

}

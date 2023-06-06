package exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Divisao {

	static Scanner ler = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int dividendo;
		int divisor;
		boolean loop = true;
		
		do {
			
			try {
				System.out.println("Digite o Dividendo: ");
				dividendo = ler.nextInt();
						
				System.out.println("Digite o Divisor: ");
				divisor = ler.nextInt();
						
				divide(dividendo, divisor);
				
				loop = false;
				
			}catch(InputMismatchException e){
				System.err.println("\nExce��o: " + e);
				ler.nextLine();
				System.out.println("\nDigite valores inteiros!");
			}catch(ArithmeticException e){
				System.err.println("\nExce��o: " + e);
				ler.nextLine();
				System.out.println("\nDigite Numeros inteiros positivos!");
			}finally{
                System.out.println("\nSempre serei executada!\n");
            }
		
		}while (loop);
	}

	public static void divide(int dividendo, int divisor) {
		System.out.println("Divis�o = " + (dividendo / divisor));
	}

}
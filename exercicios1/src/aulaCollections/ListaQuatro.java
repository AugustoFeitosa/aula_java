package aulaCollections;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ListaQuatro {

	public static void main(String[] args) {
		Set<Integer> setNumeros = new HashSet<Integer>(){
			{
				add(2);
				add(5);
				add(1);
				add(3);
				add(4);
				add(9);
				add(7);
				add(8);
				add(10);
				add(6);
			}
		};

		Scanner leia = new Scanner(System.in);
		Integer numeroDigitado;
		
		System.out.print("Digite o número que você deseja encontrar: ");
		numeroDigitado = leia.nextInt();
		
		if(setNumeros.contains(numeroDigitado)) {
			System.out.println("\nO número " + numeroDigitado + " foi encontrado");
		
		}else {
			System.out.println("\nO número " + numeroDigitado + " não foi encontrado");
		}
		
		
	}

}

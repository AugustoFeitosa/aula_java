package calculo_media;

import java.util.Scanner;

public class MediaAluno {

	public static void main(String[] args) {
		float nota1, nota2, nota3, nota4, media; 
		
		
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Seja bem-vindo!");
		System.out.print("\nEstá preparado para calcular sua média? Vamos lá!");
		
		System.out.print("\nInforme sua 1° nota: ");
		nota1 = leia.nextFloat();
		
		System.out.print("\nInforme sua 2° nota: ");
		nota2 = leia.nextFloat();
		
		System.out.print("\nInforme sua 3° nota: ");
		nota3 = leia.nextFloat();
		
		System.out.print("\nInforme sua 4° nota: ");
		nota4 = leia.nextFloat();
		
		media = (nota1 + nota2 + nota3 + nota4)/4;
		
		System.out.print("\nSua média final foi de: ");
		
		System.out.printf("%.1f ", media);
	}

}

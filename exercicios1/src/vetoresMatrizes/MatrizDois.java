package vetoresMatrizes;

import java.util.Scanner;
public class MatrizDois {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		double matriz[][] = {{4.0, 5.0, 7.0, 3.0},
		{2.5, 6.5, 4.7, 8.0},
		{10.0, 8.5, 9.5, 8.0},
		{9.0, 6.5, 7.6, 8.2},
		{5.0, 5.0, 5.0, 6.3},
		{7.0, 8.0, 9.0, 8.5},
		{5.5, 3.5, 2.5, 1.0},
		{8.0, 9.0, 10.0, 9.5},
		{5.6, 5.8, 6.5, 7.0},
		{7.5, 8.5, 9.5, 10.0}
		}, vetor[] = new double[10], media = 0.0, soma = 0.0;
		

		
		for(int indiceLinhas = 0; indiceLinhas < 10; indiceLinhas++) {
			for(int indiceColunas = 0; indiceColunas < 4; indiceColunas++) {
				soma += matriz[indiceLinhas][indiceColunas];
			}
			media = soma/4;
			soma = 0;
			vetor[indiceLinhas] = media;
		}
			System.out.print("Médias de cada aluno: ");
		for(int indice = 0; indice < 10; indice++) {
			System.out.printf("%-7.1f",vetor[indice] , " | ");
		}
		
		
		
		leia.close();
	}

}

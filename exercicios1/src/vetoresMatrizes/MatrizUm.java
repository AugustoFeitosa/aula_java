package vetoresMatrizes;

public class MatrizUm {

	public static void main(String[] args) {
		int matriz[][] = { { 1, 2, 3 }, 
							{ 4, 5, 6 }, 
							{ 7, 8, 9 } }, colunasLinhas = 3, soma = 0;

		System.out.println("Diagonal Principal");
		for (int indice = 0; indice < colunasLinhas; indice++) {
			System.out.print(matriz[indice][indice] + " ");
			soma += matriz[indice][indice];
		}
		System.out.println("Soma dos Elementos da Diagonal Principal: " + soma);
		System.out.println("");
		
		soma = 0;
		System.out.println("Diagonal Secundária");
		for (int indice = 0; indice < colunasLinhas; indice++) {
			System.out.print(matriz[indice][colunasLinhas - 1 - indice] + " ");
			soma += matriz[indice][colunasLinhas - 1 - indice];
		}
		System.out.println("Soma dos Elementos da Diagonal Secundária: " + soma);

		
	}

}

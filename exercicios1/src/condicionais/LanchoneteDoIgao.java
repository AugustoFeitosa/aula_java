package condicionais;

import java.util.Scanner;

public class LanchoneteDoIgao {

	public static void main(String[] args) {
		int quantidadeLanche, codigoLanche;
		double precoLanche, totalLanche;
		
		Scanner leia = new Scanner(System.in);
		System.out.println("   Bem-vindo a lanchonete do Igão ");
		System.out.println("\n       FAÇA SEU PEDIDO AQUI!  \n");
		System.out.println("                MENU             ");
		System.out.println(" [1]   Cachorro Quente --R$10,00");
		System.out.println(" [2]   X-Salada ---------R$15,00");
		System.out.println(" [3]   X-Bacon ----------R$18,00");
		System.out.println(" [4]   Bauru ------------R$12,00");
		System.out.println(" [5]   Refrigerante -----R$ 8,00");
		System.out.println(" [6]   Suco de Laranja --R$13,00");
		System.out.print("\n Digite o CODIGO do Lanche ou bebida: ");
		codigoLanche = leia.nextInt();
		
		System.out.print(" Digite a quantidade desejada: ");
		quantidadeLanche = leia.nextInt();
		
		
		switch(codigoLanche) {
		
		case 1:
			precoLanche = 10.00;
			totalLanche = quantidadeLanche * precoLanche;
		    System.out.println("\n Produto: Cachorro Quente");
		    System.out.printf(" Valor total: ");
		    System.out.printf("%.2f ", totalLanche);
		    break;
		case 2:
			precoLanche = 15.00;
			totalLanche = quantidadeLanche * precoLanche;
		    System.out.println("\n Produto: X-Salada");
		    System.out.printf(" Valor total: ");
		    System.out.printf("%.2f ", totalLanche);
		    break;
		case 3:
			precoLanche = 18.00;
			totalLanche = quantidadeLanche * precoLanche;
		    System.out.println("\n Produto: X-Bacon");
		    System.out.printf(" Valor total: ");
		    System.out.printf("%.2f ", totalLanche);
		    break;
		case 4:
			precoLanche = 12.00;
			totalLanche = quantidadeLanche * precoLanche;
		    System.out.println("\n Produto: Bauru");
		    System.out.printf(" Valor total: ");
		    System.out.printf("%.2f ", totalLanche);
		    break;
		case 5:
			precoLanche = 8.00;
			totalLanche = quantidadeLanche * precoLanche;
		    System.out.println("\n Produto: Refrigerante");
		    System.out.printf(" Valor total: ");
		    System.out.printf("%.2f ", totalLanche);
		    break;
		case 6:
			precoLanche = 13.00;
			totalLanche = quantidadeLanche * precoLanche;
		    System.out.println("\n Produto: Suco de Laranja");
		    System.out.printf(" Valor total: ");
		    System.out.printf("%.2f ", totalLanche);
		    break;
		}
		leia.close();
	}

}

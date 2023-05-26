package condicionais;

import java.util.Scanner;

public class CaracteristicasAnimal {

	public static void main(String[] args) {
		String primeiraCarac, segundaCarac, terceiraCarac;
		Scanner leia = new Scanner(System.in);

		System.out.println("Vamos advinhar um animal com base em suas caracteristicas!");
		System.out.println("\nInforme os dados nos campos abaixo!");
		
		System.out.print("Primeira caracteristica: ");
		primeiraCarac = leia.nextLine();
		System.out.print("Segunda caracteristica: ");
		segundaCarac = leia.nextLine();
		System.out.print("Terceira caracteristica: ");
		terceiraCarac = leia.nextLine();
		
		if(primeiraCarac.equalsIgnoreCase("vertebrado")) {
			if(segundaCarac.equalsIgnoreCase("ave")) {
				if(terceiraCarac.equalsIgnoreCase("carnivoro")) {
					System.out.println("Com base nessas caracteristicas, o animal é uma Águia!");
				}else {
					System.out.println("Com base nessas caracteristicas, o animal é uma Pomba!");
				}
				
			}else if(segundaCarac.equalsIgnoreCase("mamifero")) {
				if(terceiraCarac.equalsIgnoreCase("onivoro")) {
					System.out.println("Com base nessas caracteristicas, o animal é um Homem!");
				}else {
					System.out.println("Com base nessas caracteristicas, o animal é uma Vaca!");
				}
			}
			
		}else if(primeiraCarac.equalsIgnoreCase("invertebrado")) {
			if(segundaCarac.equalsIgnoreCase("inseto")) {
				if(terceiraCarac.equalsIgnoreCase("hematofago")) {
					System.out.println("Com base nessas caracteristicas, o animal é uma Pulga!");
				}else {
					System.out.println("Com base nessas caracteristicas, o animal é uma Lagarta!");
				}
				
			}else if(segundaCarac.equalsIgnoreCase("anelideo")) {
				if(terceiraCarac.equalsIgnoreCase("hematofago")) {
					System.out.println("Com base nessas caracteristicas, o animal é uma Sanguessuga!");
				}else {
					System.out.println("Com base nessas caracteristicas, o animal é uma Minhoca!");
				}
			}
			
		}
		
	}

}

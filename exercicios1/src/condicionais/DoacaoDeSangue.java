package condicionais;

import java.util.Scanner;

public class DoacaoDeSangue {

	public static void main(String[] args) {
		int idade;
		String nome, primeiraDoacao;

		Scanner leia = new Scanner(System.in);

		System.out.println("Bem- vindo ao Doação de Sangue!");
		System.out.println("Vamos verificar se você está apto para doar sangue.");
		System.out.println("Por favor informe seus dados nos campos abaixo:");

		System.out.print("Qual é seu nome: ");
		nome = leia.nextLine();

		System.out.print("Qual sua idade: ");
		idade = leia.nextInt();

		if (idade < 18 || idade > 69) {
			System.out.println(nome + ", não está apto(a) para doar sangue!");
		}
		
		else if (idade >= 60 && idade <= 69) {
			System.out.println("É a sua primeira vez doando sangue? [sim/não]");
			primeiraDoacao = leia.next();
			
			
			if (primeiraDoacao.equalsIgnoreCase("Sim")) {
				System.out.println(nome + ", não está apto(a) para doar sangue!");
			} else {
				System.out.println(nome + ", está apto(a) para doar sangue!");
			}
		} 
		
		else if (idade >= 18 && idade <= 59) {
			System.out.println(nome + ", está apto(a) para doar sangue!");
		} 
		
		leia.close();
	}

}

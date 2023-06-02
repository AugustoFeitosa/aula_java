package repeticao;

import java.util.Scanner;

public class PesquisaColaborador {

	public static void main(String[] args) {
		int idade, sexo, categoria, pessoaDevBack = 0, mulherDevFront = 0, devMobileQuarenta = 0, mulherDevFull = 0;
		String continua = "s";
		Scanner leia = new Scanner(System.in);
		
		while(continua.equalsIgnoreCase("s")) {
			System.out.print("Informe sua idade: ");
			idade = leia.nextInt();
			
			System.out.println("Digite o codigo referente ao seu sexo: ");
			System.out.println("[1] Masculino");
			System.out.println("[2] Feminino");
			System.out.println("[3] Outros");
			sexo = leia.nextInt();
			
			
			System.out.println("Digite o codigo referente a sua categoria: ");
			System.out.println("[1] Backend");
			System.out.println("[2] Frontend");
			System.out.println("[3] Mobile");
			System.out.println("[4] Fullstack");
			categoria = leia.nextInt();
			
			if(categoria == 1) {
				pessoaDevBack = pessoaDevBack + 1;
			}
			
			if(sexo == 2 && categoria == 2) {
				mulherDevFront = mulherDevFront + 1;
			}
			
			if(sexo == 1 && idade > 40 && categoria == 3) {
				devMobileQuarenta = devMobileQuarenta + 1;
			}
			if(sexo == 2 && idade < 30 && categoria == 4) {
				mulherDevFull = mulherDevFull + 1;
			}
			
			System.out.println("Deseja continuar? [s/n] ");
			continua = leia.next();
			
		
		}
		
		System.out.println("Total de pessoas desenvolvedoras Backend: " + pessoaDevBack);
		System.out.println("Total de mulheres desenvolvedoras Frontend: " + mulherDevFront);
		System.out.println("Total de homens desenvolvedores Mobile maiores de 40 anos: " + devMobileQuarenta);
		System.out.println("Total de mulheres desenvolvedoras FullStack menores de 30 anos: " + mulherDevFull);
		
		
		leia.close();
	}

}

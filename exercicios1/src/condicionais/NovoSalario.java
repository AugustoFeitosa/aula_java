package condicionais;

import java.util.Scanner;

public class NovoSalario {

	public static void main(String[] args) {
		String nomeFuncionario;
		int codigoCargo;
		float salario, novoSalario, percentualReajuste;
		
		
		Scanner leia = new Scanner(System.in);
		System.out.println("Bem-vindo ao Financeiro da Empresa ");
		System.out.print("Informe seu Nome: ");
		nomeFuncionario = leia.nextLine().toUpperCase();
		
		System.out.println("\n       Calcule seu novo Salario!  \n");
		System.out.println("                Cargos               \n");
		System.out.println("         [1]   Gerente");
		System.out.println("         [2]   Vendedor ");
		System.out.println("         [3]   Supervisor");
		System.out.println("         [4]   Motorista");
		System.out.println("         [5]   Estoquista");
		System.out.println("         [6]   Técnico de TI");
		System.out.print("\n" + nomeFuncionario + ", Digite o CODIGO do referente ao seu CARGO: ");
		codigoCargo = leia.nextInt();
		
		System.out.print("Digite o valor de seu Salário: ");
		salario = leia.nextFloat();
		
		
		switch(codigoCargo) {
		
		case 1:
			percentualReajuste = (salario * 10)/100;
			novoSalario = salario + percentualReajuste ;
		    System.out.println("\nNome do colaborador: " + nomeFuncionario);
		    System.out.println("Cargo: Gerente");
		    System.out.print("Novo Salario: ");
		    System.out.printf("%.2f ", novoSalario);
		    break;
		case 2:
			percentualReajuste = (salario * 7)/100;
			novoSalario = salario + percentualReajuste ;
		    System.out.println("\nNome do colaborador: " + nomeFuncionario);
		    System.out.println("Cargo: Vendedor");
		    System.out.print("Novo Salario: ");
		    System.out.printf("%.2f ", novoSalario);
		    break;
		case 3:
			percentualReajuste = (salario * 9)/100;
			novoSalario = salario + percentualReajuste ;
		    System.out.println("\nNome do colaborador: " + nomeFuncionario);
		    System.out.println("Cargo: Supervisor");
		    System.out.print("Novo Salario: ");
		    System.out.printf("%.2f ", novoSalario);
		    break;
		case 4:
			percentualReajuste = (salario * 6)/100;
			novoSalario = salario + percentualReajuste ;
		    System.out.println("\nNome do colaborador: " + nomeFuncionario);
		    System.out.println("Cargo: Motorista");
		    System.out.print("Novo Salario: ");
		    System.out.printf("%.2f ", novoSalario);
		    break;
		case 5:
			percentualReajuste = (salario * 5)/100;
			novoSalario = salario + percentualReajuste ;
		    System.out.println("\nNome do colaborador: " + nomeFuncionario);
		    System.out.println("Cargo: Estoquista");
		    System.out.print("Novo Salario: ");
		    System.out.printf("%.2f ", novoSalario);
		    break;
		case 6:
			percentualReajuste = (salario * 8)/100;
			novoSalario = salario + percentualReajuste ;
		    System.out.println("\nNome do colaborador: " + nomeFuncionario);
		    System.out.println("Cargo: Técnico TI");
		    System.out.print("Novo Salario: ");
		    System.out.printf("%.2f ", novoSalario);
		    break;
		default:
			System.out.println("Cargo inválido, Por favor tente novamente :)");
		}

	}

}

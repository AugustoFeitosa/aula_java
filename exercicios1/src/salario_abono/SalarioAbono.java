package salario_abono;

import java.util.Scanner;
public class SalarioAbono {

	public static void main(String[] args) {
		float salario, abono, novoSalario; 
		
		
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Seja bem-vindo!");
		System.out.print("\nInforme seu salário: ");
		salario = leia.nextFloat();
		
		System.out.print("\nInforme seu abono: ");
		abono = leia.nextFloat();
		
		novoSalario = salario + abono;
		
		System.out.print("\nSeu novo salário será de: R$ " + novoSalario);
		

		leia.close();
	}

}

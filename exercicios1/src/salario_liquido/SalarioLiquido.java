package salario_liquido;

import java.util.Scanner;

public class SalarioLiquido {

	public static void main(String[] args) {
		float salarioBruto, adicionalNoturno, horasExtras, descontos, salarioLiq; 
		
		
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Seja bem-vindo!");
		System.out.print("\nEstá preparado para descobrir seu Salário líquido? Vamos lá! ");
		System.out.print("\nInsira as informações a seguir");
		
		System.out.print("\nSalário bruto: ");
		salarioBruto = leia.nextFloat();
		
		System.out.print("\nAdicional noturno: ");
		adicionalNoturno = leia.nextFloat();
		
		System.out.print("\nHoras extras: ");
		horasExtras = leia.nextFloat();
		
		System.out.print("\nDescontos: ");
		descontos = leia.nextFloat();
		
		salarioLiq = salarioBruto+ adicionalNoturno + (horasExtras * 5) - descontos ;
		
		System.out.print("\nSua média final foi de: ");
		
		System.out.printf("%.2f ", salarioLiq);

		leia.close();
	}

}

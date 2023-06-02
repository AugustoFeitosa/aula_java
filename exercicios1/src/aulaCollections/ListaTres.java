package aulaCollections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;



public class ListaTres {

	public static void main(String[] args) {
		Set<Integer> setNumeros = new HashSet<Integer>();
		Scanner leia = new Scanner(System.in);
		Integer numeros;
		
		for(int count = 1; count <=10; count++) {
			System.out.print("Digite o "+ count + "° número:");
			numeros = leia.nextInt();
			setNumeros.add(numeros);
		}
		
		Iterator<Integer> iNumeros = setNumeros.iterator();
		System.out.println("\nListar todos os Elementos com o Iterator");
		while(iNumeros.hasNext()) {
			System.out.println(iNumeros.next());
		}
		
		
		leia.close();
	}

}

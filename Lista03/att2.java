package Lista03;
import java.util.Scanner;

public class att2 {
	public static void main(String[] args) {
		int numeros[] = new int[8];
		int positivos[] = new int[8];
		int negativos[] = new int[8];
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite 8 números: ");
		int numPositivo = 0, numNegativo = 0;
		for (int i = 0; i < numeros.length; i++) { 
		    System.out.print("-> ");
		    numeros[i] = sc.nextInt();
		    if (numeros[i] >= 0) {
		        positivos[numPositivo] = numeros[i];
		        numPositivo++;
		    } else {
		        negativos[numNegativo] = numeros[i];
		        numNegativo++;
		    }
		}

		
		System.out.printf("foram encontrados %d números positivos\n", numPositivo);
		for (int i = 0; i < numPositivo; i++) {
		    System.out.println(positivos[i]);
		}
		System.out.printf("foram encontrados %d números negativos\n", numNegativo);
		for (int i = 0; i < numNegativo; i++) {
		    System.out.println(negativos[i]);
		}
	}
}



package Lista03;
import java.util.Scanner;
public class att6 {
	public static void main(String[] args) throws Exception {
		 Scanner scanner = new Scanner(System.in);
		 int [ ] valor = new int [6];
		 int [ ] pares = new int [6];
		 int [ ] impares = new int [6];
		 
		 int soma = 0;
		 int calq = 0;
		 
		 for (int i = 0; i < valor.length; i++ ) {
			 System.out.println("informe um valor: ");
			 valor[i] = scanner.nextInt();
			 
		 }
		 
		 for ( int i = 0; i < pares.length; i++) {
			 if (valor [i] % 2 ==0) {
				 pares[i] = valor[i];
				 
			 }
		 }
		 for ( int i = 0; i < pares.length; i++) {
			 if (valor [i] % 2 !=0) {
				 pares[i] = valor[i];
				 calq++;
				 
			 }
		 }
		 soma = pares[0] + pares [1] + pares [2] + pares [3]+ pares [4]+pares [5]; 
		 
		 System.out.println("numeros pares");
		 for (int i =0; i < pares.length; i++) {
			 if (pares[i] !=0) {
				 System.out.println("O numero " + pares[i] + " na posição" + i );
			 }
		 }
	     System.out.println("sosma dos valores pares são: " +calq);
	     
	     System.out.println("numeros impares");
	     for (int i =0; i < impares.length; i++) {
			 if (impares[i] !=0) {
				 System.out.println("O numero " + impares[i] + " na posição" + i );
			 }
		 }
	     
	     System.out.println("quantidades de numeros impares: " +calq);

	}
}



package Lista03;
import java.util.Scanner;

public class att7 {
	public static void main(String[] args) {
		  Scanner scanner = new Scanner(System.in);
		  	
		  int vetorA[] = new int [6];
		  int vetorB[] = new int [vetorA.length];
		  	
		  int vetorC[] = new int [6];
		  int vetorD[] = new int [vetorC.length];
		  
		  for (int i=0; i< vetorA.length; i++) {
			  
			  System.out.println("Entre com o valor da posição " +i);
			  vetorA[i] = scanner.nextInt();		 	
		  }
		  int soma = 0;
		  for (int i=0; i<vetorA.length; i++) {
			  if (vetorA[i] % 2 ==0) {
				  soma += vetorA[i];
			  } 
		  }
		
		  
		  System.out.print("Vetor A = ");
		  for (int i=0; i<vetorA.length; i++) {
			  System.out.print(vetorA[i] + " ");		  
		  }
		  System.out.println();
		  
		  System.out.println("Soma: " +soma);
		  
 //impar-------------------------------------------------------
	  for (int i=0; i< vetorC.length; i++) {
			  
			  System.out.println("Entre com o valor da posição " +i);
			  vetorC[i] = scanner.nextInt();		 	
		  }
	  	int soma1 = 0;
		  for (int i=0; i<vetorC.length; i++) {
			  if (vetorC[i] % 2 !=0) {
				  soma1 += vetorC[i];
			  } 
		  }
		
		  
		  System.out.print("Vetor C = ");
		  for (int i=0; i<vetorC.length; i++) {
			  System.out.print(vetorC[i] + " ");		  
		  }
		  System.out.println();
		  
		  System.out.println("Soma: " +soma1);
		  
		  

		  
		
		  
	}

}
/*

else if(vetorA[i] % 2 != 0){
	 soma += vetorA[i];
 }
}
*/
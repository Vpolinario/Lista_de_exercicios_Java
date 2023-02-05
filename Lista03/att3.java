package Lista03;

import java.util.Scanner;

public class att3 {
	public static void main(String[] args) {
		  Scanner scanner = new Scanner(System.in);
		  
		  int vetorC[] = new int [9];
		  int vetorD[] = new int [vetorC.length];
		  
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
		  
		  System.out.println("Soma: " +soma1 );


	}

}

package Lista03;

import java.util.Scanner;
public class att1 {
	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
		 
		 int vetor1 [] = new int [10];
		 int vetor2 [] = new int [10];
		 int vetor3 [] = new int [20];
		 
		 int i =0;
		 int j =0;
	     
		 for (i = 0; i<10; i++) {
			 System.out.println("Informe o valor para o posição " +(i+1)+ " do vetor 1");
			vetor1[i] = Integer.parseInt(scanner.nextLine());
		 }
		 
		 for (i = 0; i<10; i++) {
			 System.out.println("Informe o valor para o posição " +(i+1)+ " do vetor 2");
			vetor2[i] = Integer.parseInt(scanner.nextLine());
		 }
	
		 for ( i = 0; i<10; i++) {
			 vetor3[j] = vetor1[i];
			 j++;
			 vetor3[j] = vetor2[i];
			 j++;
		 }
		
		 System.out.println("Os valores do vetor3 são: ");
		 for (j=0; j<20; j++) {
			 System.out.println(vetor3[j]);
		 }
		 
	    	 
	}

}

 package Lista01;

import java.util.Scanner;

public class Lista01_Att_3 {
	public static void main (String[] args) {
		Scanner entrada = new Scanner (System.in);
		
		double anosX = 0 ;
		int contaSegundos = 0;
		
		System.out.println("Informe os anos: ");
		anosX = entrada.nextDouble();
		
		contaSegundos = (int) ( ( ( (anosX * 365)*24)*60)*60);
		System.out.println("O ano tem: " + contaSegundos + "segundos");
	}

}

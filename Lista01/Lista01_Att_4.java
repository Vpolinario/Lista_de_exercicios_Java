package Lista01;

import java.util.Scanner;

public class Lista01_Att_4 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		double metros = 0, pes = 0, polegadas =0;
		
		System.out.println("Informe um valor em metros: ");
		metros = entrada.nextDouble();
		
		pes = metros * 3.28084;
		polegadas = metros * 39.3701;
		
			System.out.println("O valor convertido para pés é de: " + pes);
			System.out.println("O valor convertido para polegadas é de: " + polegadas);		
	
	}

}

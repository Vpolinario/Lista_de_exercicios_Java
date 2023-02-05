


package Lista01;

import java.util.Scanner;

public class Lista01_Att_1{
	public static void main (String[] args) {
	Scanner entrada = new Scanner (System.in);
	
	double nota1=0, nota2=0, nota3=0, soma;
	
	System.out.println("Digite a primeira nota: ");
	nota1 = entrada.nextDouble();
	
	System.out.println("Digite a segunda nota: ");
	nota2 = entrada.nextDouble();
	
	System.out.println("Digite a terceira nota: ");
	nota3 = entrada.nextDouble();
	soma = (nota1+nota2+nota3)/3;
	
	
	System.out.println("A média das notas é: " + soma);

	
	}

}

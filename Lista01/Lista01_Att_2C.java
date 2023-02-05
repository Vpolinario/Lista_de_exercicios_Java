package Lista01;

import java.util.Scanner;

public class Lista01_Att_2C {
	public static void main (String[] args) {
		Scanner entrada = new Scanner (System.in);
		
		double boleto1=0, boleto2=0, boleto3=0,boleto4=0, salarioBruto, salarioLiquido, somaBoletos, restoSalario;
		
		System.out.println("Informe seu Sálario Bruto:");
		salarioBruto = entrada.nextDouble();
		
		System.out.println("Informe o valor do primeiro boleto: ");
		boleto1 = entrada.nextDouble();
		
		System.out.println("Informe o valor do segundo boleto: ");
		boleto2 = entrada.nextDouble();
		
		System.out.println("Informe o valor do terceiro boleto: ");
		boleto3 = entrada.nextDouble();
		
		System.out.println("Informe o valor do quarto boleto: ");
		boleto4 = entrada.nextDouble();
		
		salarioLiquido = salarioBruto - (salarioBruto * 0.14);
		somaBoletos = boleto1 + boleto2 + boleto3 + boleto4;
		restoSalario =  salarioLiquido - somaBoletos;
		
		System.out.println("Seu sálario com Liquido é de (Desconto de 0,14): " + salarioLiquido);
		System.out.println("O valor total a ser pago é de: " + somaBoletos);
		System.out.println("Saldo do gente fina é de: " + restoSalario);
		
	}

}

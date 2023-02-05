package Lista02;

import java.util.Scanner;
import java.util.Scanner;
public class att3 {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

double salarioBruto, restoDinheiro, boleto1 = 0, boleto2 = 0,boleto3 = 0,boleto4 = 0, somaBoletos, desconto, totalDescontos,  vale, salarioLiquido;

System.out.println("Informe seu salário Bruto: ");
salarioBruto = scanner.nextDouble();

desconto = salarioBruto *(12.5/100);
vale = desconto * (6.0/100);
totalDescontos = vale + desconto;
salarioLiquido = salarioBruto - totalDescontos;


System.out.println("Seu salário liquido é de: " +salarioLiquido);

System.out.println("Informe o valor do primiero boleto: ");
boleto1 = scanner.nextDouble();
System.out.println("Informe o valor do segundo boleto: ");
boleto2 = scanner.nextDouble();
System.out.println("Informe o valor do terceiro boleto: ");
boleto3 = scanner.nextDouble();
System.out.println("Informe o valor do quarto boleto: ");
boleto4 = scanner.nextDouble();

somaBoletos = boleto1 + boleto2 + boleto3 + boleto4;
System.out.println("Total a ser pago: " + somaBoletos);

restoDinheiro = salarioLiquido - somaBoletos;

System.out.println("Seu saldo é de: " + restoDinheiro);

if (salarioLiquido > somaBoletos) {
	System.out.println("Mandar para poupança");
} else if (salarioLiquido < somaBoletos) {
	System.err.println("deu ruim");

}

}

}
	
package Lista03;

import java.util.Scanner;

public class att4 {

    public static void main(String[] args) {

       Scanner scanner = new Scanner(System.in);

        int Aluno[] = new int[10];
        String[] gabarito = new String[] {"a", "a", "a", "a", "a", "a", "a", "a"};
        String resposta;
        int nota = 0;


        for (int i = 0; i < 10; i ++) {

            System.out.println("Aluno" + (i+1));

            for (int j = 0; j < 8; j++) {
                System.out.println("Informe a resposta da " + (j+1) + " questão");
                resposta = scanner.next();

                if (resposta.equals(gabarito[j]) ) {
                    nota++; 
                }
            }
            System.out.println("A nota do aluno " + (i+1) + " é : " + nota);
            if(nota >= 6 ) {
            	System.out.println("Aprovado");    	
            }else if(nota < 6) {
            	System.out.println("Reprovado");
            }
            nota = 0; 
        }

    }


    }
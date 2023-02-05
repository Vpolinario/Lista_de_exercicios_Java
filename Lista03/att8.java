package Lista03;

import java.util.Scanner;

public class att8 {

	public static void main(String[] args) throws Exception {
	      double [] [] venda = new double [12][4];
	      String [] mes = {"janeiro", "fevereiro","março","abril","maio","junho","julho","agosto","setembro","outubro","novembro","dezembro"};
	      double [] valormes = new double [12];
	      double[] valorsemana = new double [4];
	      double totvendas = 0;
	     
	    Scanner entrada = new Scanner(System.in);
	          
	      for (int i=0; i<12; i++){
	        System.out.println(mes[i]);
	        int semana = 1;
	        for (int j = 0; j < 4; j++){
	          System.out.println("Informe o valor das vendas da semana "+ semana+" : ");
	          venda[i][j] = entrada.nextDouble();
	          semana++;
	        }
	      }
	    entrada.close();

	  for (int i =0; i <12; i++){
	    for (int j =0; j <4;j++){
	      valormes[i] = valormes[i] + venda[i][j];
	    }
	    totvendas = totvendas + valormes[i];
	  }
	      for (int i = 0; i<4; i++){
	        for (int j = 0; j <12; j++){
	          valorsemana[i] = valorsemana[i] + venda[j][i];
	        }
	      }
	      for (int i = 0; i <valormes.length; i++){
	        System.out.println("Total vendido no mes de "+ mes[i] + ": "+ valormes[i]);
	             }
	          for (int i = 0; i <valorsemana.length; i++){
	        System.out.println("Total vendido por semana de cada mes durante todo o ano: "+ valorsemana[i]);
	          }
	      System.out.println("Total vendido no ano: "+totvendas);
	    }

	}



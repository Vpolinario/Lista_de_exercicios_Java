package Lista03;
import java.util.Scanner;
public class att5 {

	public static void main(String[] args) {

	    Scanner scanner = new Scanner(System.in);
		double [] temperaturas = new double [12];
		String [] mes = {"jan", "fav","mar","abr","mai","jun","jul","ago","set","out","nov","dez"};
		
		int calq =0, maiorTemperatura=0, menorTemperatura =0;
		double maior = 0, menor= 0;
			
			
			for (int i = 0; i <temperaturas.length; i++) {
				System.out.println("informe uma temperatura: "  + mes[i] );
				temperaturas[i] = scanner.nextDouble();
				 
			}
			
			for(int i = 0; i < temperaturas.length; i++) {
				if (calq ==0) {
					maior = temperaturas[i];
					menor = temperaturas[i];
					calq ++;
				}else {
					if(temperaturas[i] > maior) {
						maior = temperaturas[i];
						maiorTemperatura = i;
					}else if( temperaturas[i]< menor) {
						menor = temperaturas[i];
						menorTemperatura = i;
					}
				}
			}
			
			System.out.println("A maior temperatura foi: " +maior+ mes[maiorTemperatura]);
			System.out.println("A maior temperatura foi: " +menor+ mes[menorTemperatura]);
					
		}
					
	}





package Lista02;
import java.util.Scanner;
public class att1 {
	
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		double notaAluno = 0, freqAluno=0 ,  decimal ;
		
		System.out.println("Informe sua nota: ");
		notaAluno = scanner.nextDouble();
		
		System.out.println("Informe sua frequencia: ");
		freqAluno = scanner.nextDouble();
		
	
		
		
		if (notaAluno >=7 && freqAluno >=0.75 ) {
			System.out.println("Aprovado");			
		}else if ((notaAluno >=4 )&&(notaAluno <7 )&&(freqAluno == 0.75)) {
			System.out.println("Em recuperação");		
		}else if(notaAluno < 4 && freqAluno < 0.75 ){
			System.out.println("Reprovado");
			
			
			
		}
				
	}

}


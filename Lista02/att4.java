package Lista02;
 
import java.util.Scanner;

public class att4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int base, potencia;
		
		System.out.println("Sn = 1^1 + 2^2 + 3^3...+ n^n");
		System.out.println("Digite uma base: ");
		base = scanner.nextInt();
		
		System.out.println("Digite uma base: ");
		potencia = scanner.nextInt();
		
		
		System.out.println(Math.pow(1, 1) + (Math.pow(2, 2) + (Math.pow(3, 3) + (Math.pow(base, potencia) ) ) ) );
		
	}

}

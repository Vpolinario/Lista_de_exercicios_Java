package Lista02;
 
import java.util.Scanner;

public class att2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int altura = 0, beleza = 0, carisma = 0, nota = 0, misericodia;

		System.out.println("Informe uma nota para altura de 0 a 10: ");
		altura = scanner.nextInt();

		System.out.println("Informe uma nota para beleza de 0 a 10: ");
		beleza = scanner.nextInt();

		System.out.println("Informe uma nota para carisma de 0 a 10: ");
		carisma = scanner.nextInt();

		if (altura >= 7 && beleza >= 7 && carisma >= 7) {
			System.out.println("Bora");
		} else if ((altura >= 7 && beleza >= 7) || (carisma >= 7 && altura >= 7) || (beleza >= 7 && carisma >= 7)) {
			System.out.println("Só vai");
		} else if ((altura >= 7) || (beleza >= 7) || (carisma >= 7)) {
			System.out.println("fé em Deus");
		} else if ((altura <= 0) || (beleza <= 0) || (carisma <= 0)) {
			System.out.println("Misericórdia");

		}

	}
}
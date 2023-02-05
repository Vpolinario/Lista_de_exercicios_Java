package Lista02;

import java.util.Scanner;

public class att9 {
	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int ano, anoIni, anoFim, dias = 0;

        System.out.println("Informe ano inicial:");
        anoIni = scanner.nextInt();

        System.out.println("Informe final:");
        anoFim = scanner.nextInt();

        for (ano = anoIni; ano <= anoFim; ano ++){

            if (anoIni % 4 == 0){
                dias = dias +366;
                System.out.println("é bissexto");
            }else{
                dias = dias +365;
                System.out.println("não é bissexto");
            }
        }
    }

}

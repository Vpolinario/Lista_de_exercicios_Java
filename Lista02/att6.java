package Lista02;
 import java.util.Scanner;
 
public class att6 {
	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
		 
		 int modao;
		 double porcentagem, dose, valorInicial, valorDaConta;
		 
		 
		 System.out.println("Digite o valor inical da conta: ");
		 valorInicial = scanner.nextDouble();
		 
		 System.out.println("Informe valor da dose: ");
		 dose = scanner.nextDouble();
		 
		 System.out.println("Ouvir mais um modao? (Digi 1 pra sim e 2 pra não)");
		 modao = scanner.nextInt();
		 
		 switch(modao) {
		 case 1:
			 
			while (modao ==1) {
				valorDaConta = valorInicial + dose;
				porcentagem = (dose * 10/100);
				valorInicial = valorDaConta + porcentagem;
				System.out.printf("O valor da sua conta é: %.2f. ", (valorDaConta*1 +1));
				System.out.println("Você deseja ouvir mais um modão " + "Digite 1 para sim e 2 para não");
				modao = scanner.nextInt();				
			}
		 case 2:
			 System.out.println("Volte sempre!!!");
			 break;
		 }
	}

}

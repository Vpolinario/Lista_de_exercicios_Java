package Lista04;

import java.util.Scanner;

public class App {
	public static void main(String[] args) throws Exception{
		Pessoa people = new Pessoa();
		
		Scanner Scanner = new Scanner(System.in);
		
		System.out.println("Informe seu Nome:");
		people.setNome(Scanner.next());
		
		System.out.println("Informe seu Sobrenome:");
		people.setSobreNome(Scanner.next());
		
		System.out.println("Informe sua data de Nascimento\n Dia:");
		int d = Scanner.nextInt();
		
		System.out.println("Mês");
		int m = Scanner.nextInt();
		
		System.out.println("Ano");
		int a = Scanner.nextInt();
		
		System.out.println("Informe sua altura: ");
		people.setaltura(Scanner.nextDouble());
		
		System.out.println("Informe seu peso: ");
		people.setPeso(Scanner.nextDouble());
		
		Scanner.close();
		
		Data dtNascimento = new Data(d,m,a);
		
		people.CalculaIdade(dtNascimento);
		
		people.CalculaIMC(people.getPeso(),people.getAltura());
		
		people.InformaObesidade(people.getImc());
		
		String nomeCompleto = people.getNome() + " "+ people.getSobreNome();
		
		System.out.println("Nome completo: " +nomeCompleto);
		System.out.println("Nome de referência: " + people.getSobreNome() + ", " + people.getNome().toUpperCase());
		System.out.println("Idade: " + people.getIdade());
		System.out.println("Peso: " + people.getPeso());
		System.out.println("Altura: " + people.getAltura());
		System.out.println("IMC: " + people.getImc());
		System.out.println("Classificação: " + people.getClassCorporal());
			
	}
}

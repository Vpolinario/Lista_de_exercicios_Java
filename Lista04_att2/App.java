package Lista04_att2;
import java.util.Scanner;
public class App {
	public static void main(String[] args) throws Exception{
		Scanner Scanner = new Scanner(System.in);
		Fatura fatura = new Fatura();
		Produto produto1 = new Produto("Placa Mãe",01 ,225);
		Produto produto2 = new Produto("16Gb RAM",02 ,300);
		Produto produto3 = new Produto("Nvme 8gb",03 ,315);
		
		int flag = 0;
		
		
		do {
			Menu();
			
			flag = Scanner.nextInt();
			
			if(flag ==1) {
				produto1.exibirProduto();
				produto2.exibirProduto();
				produto3.exibirProduto();
				
				System.out.println("Informe o código do produto: ");
				int codigoProduto = Scanner.nextInt();
				System.out.println("Informe a quantidade desejada: ");
				int qntProduto = Scanner.nextInt();
				
				if (produto1.getCodigo()== codigoProduto) {
					Item itemComprado = new Item(produto1, qntProduto);
					fatura.addItemNaLista(itemComprado);
				} else if (produto2.getCodigo()== codigoProduto) {
					Item itemComprado = new Item(produto2, qntProduto);
					fatura.addItemNaLista(itemComprado);
				} else if (produto3.getCodigo()== codigoProduto) {
					Item itemComprado = new Item(produto3, qntProduto);
					fatura.addItemNaLista(itemComprado);
				}
				
			}else if (flag ==2) {
				fatura.Fatura();
			}
						
		} while (flag !=3);
		
		Scanner.close();	
	}
	
	public static void Menu() {
		System.out.println("\n-------MENU-------");
		System.out.println("\n1-COMPRAR");
		System.out.println("\n2-VER FATURA");
		System.out.println("\n3-ENCERRAR");
		
	}
}
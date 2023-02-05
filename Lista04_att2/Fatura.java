package Lista04_att2;
import java.util.ArrayList;
public class Fatura {
	private  ArrayList<Item> listaDeItens = new ArrayList<Item>();
	private Item itemComprado = new Item();
	private double valorFatura;
	
	
	public Fatura() {
		valorFatura = itemComprado.getValorItem();
	}
	
	public Fatura (Item itemComprado) {
		this.listaDeItens.add(itemComprado);
		this.valorFatura = valorFatura + itemComprado.getValorItem();
	}
	
	public ArrayList<Item> getListaDeItems(){
		return listaDeItens;
	}
	public void setListaDeItens(ArrayList<Item> listaDeItens) {
		this.listaDeItens = listaDeItens;
	}
	
	public double getValorFatura() {
		return valorFatura;
	}
	
	public void setValorFatura(double valorFatura) {
		this.valorFatura = valorFatura;
	}
	
	public void addItemNaLista(Item itemComprado) {
		listaDeItens.add(itemComprado);
		valorFatura = valorFatura +  itemComprado.getValorItem();
	}
	
	public void Fatura() {
		for (Item i : listaDeItens) {
			System.out.println("Nome: " + i.getProdutoComprado().getNome());
			System.out.println("Código: " + i.getProdutoComprado().getCodigo());
			System.out.println("Preço: " + i.getProdutoComprado().getPreco());
			System.out.println("Quantidade comprada: " + i.getQntComprada());
			System.out.println("Valor total: " + i.getValorItem());

		}
		System.out.println("Sua fatura é de:  " +valorFatura+ " reais.");
	}
	

}

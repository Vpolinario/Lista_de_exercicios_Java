package Lista04_att2;

public class Item {
	
	private Produto produtoComprado = new Produto();
	private int qntComprada;
	private double valorItem;
	
	public Item() {
		produtoComprado.setNome("");
		produtoComprado.setCodigo(0);
		produtoComprado.setPreco(0.0);
		qntComprada =0;
		valorItem = qntComprada * produtoComprado.getPreco();
		
	}
	 
	public Item (Produto produtoComprado, int qntComprada) {
		this.produtoComprado = produtoComprado;
		this.qntComprada = qntComprada;
		valorItem = qntComprada * produtoComprado.getPreco(); 
		
	}
	
	public Produto getProdutoComprado() {
		return produtoComprado;
		
	}
	
	public void setProdutoComprado(Produto produtoComprado) {
		this.produtoComprado = produtoComprado;
	}
	
	public int getQntComprada() {
		return qntComprada;
	}
	
	public void setQntComprada(int qntComprada) {
		this.qntComprada = qntComprada;
	}
	
	public double getValorItem() {
		return valorItem;
	}
	public void setValorItem(int valorItem) {
		this.valorItem = valorItem;
	}
}	

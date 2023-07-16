package entities;

public class Produto {

	public String nome;
	public double price;
	public int qtde;
	
	
	public Produto(String nome, double price, int qtde) {
		this.nome = nome;
		this.price = price;
		this.qtde = qtde;
	
	}
	
	public Produto(String nome, double price) {
		this.nome = nome;
		this.price = price;
		
		
	
	}
	
	public double valorTotal() {
		return price * qtde;
	}
	
	public void addProduto(int qtde) {
		this.qtde += qtde;

		
	}
	
	
	
	public String toString() {
		return nome
			+ ", o preço do produto:"
			+ String.format("%.2f", price)
			+", "
			+ qtde
			+ " und, Total: R$ "
			+ String.format("%.2f", valorTotal());
	}
	
}

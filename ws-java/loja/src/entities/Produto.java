package entities;

public class Produto {
	private String name;
	private double price;
	private int quantity;
	
	
	
	// obrigando a inserir parametros
	// proteger o produto
	
	public Produto(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public double totalValueInStock() {
		return price * quantity;
	};
	
	//this - se refere à variável da classe (atributo)
	public void addProducts(int quantity) {
		this.quantity += quantity;
	};
	
	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	};
	// sobrepondo o método toString que já vem no Object
	public String toString() {
		return name + ", " + "$ " + String.format("%.2f", price) + ", " + quantity + " units. " + "Total: $ " + String.format("%.2f", totalValueInStock());
	}
	
}

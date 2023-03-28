package util;

public class Product {

	private String name;
	private double price; 
	private int quantity;
	
	//sobrecarga	
	public Product() {
		
	}
	
	public Product(String name, double price) {
		super();
		this.name = name;
		this.price = price;
		
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	
	

}

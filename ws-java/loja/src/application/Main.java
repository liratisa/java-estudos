package application;
 
import java.util.Locale;
import java.util.Scanner;

import entities.Produto;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);	
		
		
		System.out.println("Enter product data:");
		
		System.out.print("Name: ");
		String name = sc.nextLine();
		
		System.out.print("Price: ");
		double price = sc.nextDouble();
		
		System.out.print("Quantity in stock: ");
		int quantity = sc.nextInt();
		
		Produto produto = new Produto(name, price, quantity);
		
		System.out.println("Product data: " + produto);
		
		System.out.println();
		System.out.print("Enter the number of products to be added in stock: ");
		int qt = sc.nextInt();
		produto.addProducts(qt);
		
		System.out.println("Updated data: " + produto);
		
		System.out.println();
		System.out.print("Enter the number of products to be removed from the stock: ");
		qt = sc.nextInt();
		produto.removeProducts(qt);
		System.out.println("Updated data after remotion: " + produto);
		
		produto.setName("Computer");
		System.out.println("Updated name: " + produto.getName());
		
		
		sc.close();

	}

}

package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities_enum.OrderStatus;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Enter client data:");
		System.out.print("Name: ");
		String name = sc.nextLine();
		
		System.out.print("Email: ");
		String email = sc.next();
		
		System.out.print("Birth date (DD/MM/YYYY): ");
		Date birthDate = sdf.parse(sc.next());
		
		Client client = new Client(name, email, birthDate);
		
		System.out.print("How many items to this order? ");
		int n = sc.nextInt();
		sc.nextLine();	
		
		System.out.println("Enter order data: ");
		System.out.print("Status: ");
		String status = sc.nextLine();
		
		Order order = new Order(new Date(), OrderStatus.valueOf(status), client);
		
		
		for(int i = 0; i < n; i++) {
			System.out.println("Enter product #" + (i + 1) + " data:");
			
			System.out.print("Product name: ");
			String productName = sc.nextLine();
			
			System.out.print("Product price: ");
			double productPrice = sc.nextDouble();
			
			System.out.print("Quantity: ");
			int quantity = sc.nextInt();
			sc.nextLine();
			
			// instancia um produto por vez
			Product product = new Product(productName, productPrice);
			
			// um item por vez
			OrderItem orderItem = new OrderItem(quantity, productPrice, product);			
			
			
			order.addItem(orderItem);
			
		}
		
		System.out.println(order);
		sc.close();

	}

}

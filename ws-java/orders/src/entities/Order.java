package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities_enum.OrderStatus;

public class Order {
	private Date moment;
	private OrderStatus status;
	private Client client;
	
	private List<OrderItem> itens = new ArrayList<>();
	
	private static SimpleDateFormat bday = new SimpleDateFormat("dd/MM/yyyy");
	private static SimpleDateFormat td = new SimpleDateFormat("dd/MM/yyyy hh:MM:ss");
	
	public Order() {
		
	}

	public Order(Date moment, OrderStatus status, Client client) {
		this.moment = moment;
		this.status = status;
		this.client = client;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public List<OrderItem> getItem() {
		return itens;
	}

	public void addItem(OrderItem iten) {
		itens.add(iten);
	}
	
	public void removeItem(OrderItem iten) {
		itens.remove(iten);
	}
	
	public Double total() {
		double sum = 0;
		
		for(OrderItem i : itens) {
			sum += i.subTotal();
		}
		
		return sum;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		sb.append("\n");
		sb.append("ORDER SUMMARY: \n");
		sb.append("Order moment: " + td.format(moment) + "\n");
		sb.append("Order status: " + status + "\n");
		sb.append("Client: " + client.getName() + " (" + bday.format(client.getBirthDate()) + ") - " + client.getEmail() + "\n");
		sb.append("Order items: \n");
		sb.append("\n");
		
		for(OrderItem i : itens) {
			sb.append(i.getProduct().getName() + ", " + "$ " + i.getPrice() + ", ");
			sb.append("Quantity: " + i.getQuantity() + ", ");
			sb.append("Subtotal: $ " + i.subTotal() + "\n");
		}
		
		sb.append("\n " + "Total price: $ " + total());
		
		return sb.toString();
	}
	
 }

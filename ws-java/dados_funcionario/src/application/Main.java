package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Salario;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		Salario salario;
		
		salario = new Salario();
		
		System.out.print("Name: ");
		salario.name = sc.nextLine();
	
		System.out.print("Gross salary: ");
		salario.grossSalary = sc.nextDouble();
		
		
		
		System.out.print("Tax: ");
		salario.tax = sc.nextDouble();
		
		
		System.out.println("Employee: " + salario);
		
		System.out.println();
		
		System.out.print("Which percentage to increase salary? ");
		salario.increaseSalary(sc.nextDouble());
		
		System.out.println("Updated data: " + salario);
		sc.close();

	}

}

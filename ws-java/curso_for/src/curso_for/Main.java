package curso_for;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite a temperatura em Celsius:");
		double C = sc.nextDouble();
		
		double F = 9.0 * C / 5.0 + 32.0;
		
		System.out.println("Equivalente em Fahrenheit: " + F);
		
		System.out.println("Deseja repetir? (s/n)");
		char resp = sc.next().charAt(0);
		
		
		sc.close();

	}

}

package application;

import java.util.Scanner;

import entities.Triangle;

public class Main {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		Triangle x, y;
		
		x = new Triangle();
		y = new Triangle();		
		
		System.out.println("Digite as medidas do triângulo x:");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		
		System.out.println("Digite as medidas do triângulo y:");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();		
		
		double areaX = x.area();		
		double areaY = y.area();
		
		System.out.println("Triângulo X: " + areaX);
		System.out.println("Triângulo Y: " + areaY);
		
		if (areaX > areaY) {
			System.out.println("O triângulo X é maior que o Y");
		} else {
			System.out.println("O triângulo Y é maior que o X");
		}
		
		sc.close();

	}

}

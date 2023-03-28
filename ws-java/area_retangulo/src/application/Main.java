package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Retangle;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Retangle retangle;
		
		retangle = new Retangle();
		
		System.out.println("Enter rectangle width and height:");
		retangle.width = sc.nextInt();
		retangle.height = sc.nextInt();
		
		System.out.println("AREA = " + retangle.area());
		System.out.println("PERIMETER = " + retangle.perimeter());
		System.out.println("DIAGONAL = " + retangle.diagonal());
		
		sc.close();
	}

}

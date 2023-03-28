package app;

import java.util.Scanner;

import entities.Media;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Media media;
		
		media = new Media();
		
		System.out.print("Digite o nome do aluno: ");
		media.name = sc.nextLine();
		
		System.out.print("Digite a nota 1: ");
		media.n1 = sc.nextDouble();
		
		System.out.print("Digite a nota 2: ");
		media.n2 = sc.nextDouble();
		
		System.out.print("Digite a nota 3: ");
		media.n3 = sc.nextDouble();
		
		System.out.println("FINAL GRADE = " + media.calculoMedia());
		
		if (media.calculoMedia() < 60.0) {
			System.out.println("FAILED! Missing : " + media.mediaFinal() + " points");
		} else {
			System.out.println("PASSED");
		}
		
		sc.close();

	}

}

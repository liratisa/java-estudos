package curso_ifelse;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int hora;
		
		System.out.println("Que horas são?");
		
		hora = sc.nextInt();
		
		if(hora < 12) {
			System.out.println("Bom dia");
		} else if (hora > 10) {
				
			} //sysout pode ser fora das condições e só uma vez !
		}
	
		sc.close();
}

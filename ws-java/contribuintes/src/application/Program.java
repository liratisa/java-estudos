package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Contribuinte;
import entities.PessoaFisica;
import entities.PessoaJuridica;

public class Program {	

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Entre com o número de contribuintes: ");
		int n = sc.nextInt();
		sc.nextLine();
		
		List <Contribuinte> list = new ArrayList<>();
		
		for(int i = 0; i < n; i++) {
			System.out.println("Dados do contribuinte #" + (i + 1) + ": ");
			
			System.out.print("Pessoa física ou jurídica (f/j)? ");
			char tipo = sc.next().charAt(0);
			sc.nextLine();
			
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			
			System.out.print("Renda anual: R$ ");
			double rendaAnual = sc.nextDouble();		
						
			if(tipo == 'f') {
				
				System.out.print("Gastos com saúde (anual): R$ ");
				double gastoSaude = sc.nextDouble();
				
				list.add(new PessoaFisica(nome, rendaAnual, gastoSaude));
			} else if (tipo == 'j'){
				System.out.print("Qual a quantidade de funcionários? ");
				int funcionarios = sc.nextInt();
				sc.nextLine();
				
				list.add(new PessoaJuridica(nome, rendaAnual, funcionarios));
			} else {
				System.out.println("Por favor, tente novamente.");
				tipo = sc.next().charAt(0);
			}
		}
		
		System.out.println();
		System.out.println("Cálculo de impostos:");		
		
		for(Contribuinte c : list) {			
			System.out.println(c.getNome() + ": R$ " + String.format("%.2f", c.calculoImposto()));
		}
		
		double sum = 0.0;
		
		for(Contribuinte c : list) {
			sum += c.calculoImposto();			
		}
		
		System.out.println("Total: R$" + String.format("%.2f", sum));
		
		sc.close();

	}

}

package app;

import java.util.Scanner;

import entities.ContaBancaria;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double saldo;
		
		// ATENÇÃO - Colocar um nextLine depois do nextInt pq 'não aceita' o enter
		System.out.print("Digite o número da conta: ");
		int conta = sc.nextInt();
		sc.nextLine();
		
		System.out.print("Digite o nome do titular: ");
		String titular = sc.nextLine();		
			
		System.out.print("Deseja realizar um depósito inicial? (S/N): ");
		char deposito = sc.next().charAt(0);
		
		if(deposito == 'S') {
			System.out.print("Digite o valor do depósito inicial: R$ ");
			saldo = sc.nextDouble();			
		} else {
			saldo = 0;
		}
		
		System.out.println();
		
		ContaBancaria account = new ContaBancaria(conta, titular, saldo);
		System.out.println("Dados iniciais da conta: " + "\n" + account);
		
		System.out.println();
		
		System.out.print("Qual o valor a ser depositado? R$ ");
		double valor = sc.nextDouble();
		account.deposito(valor);
		System.out.println();
		System.out.print("Dados atualizados da conta: " + "\n" + account);
		
		
		System.out.println();
		System.out.print("Qual o valor a ser sacado? R$ ");
		valor = sc.nextDouble();
		account.saque(valor);
		System.out.print("Dados atualizados da conta: " + "\n" + account);
		
		
		sc.close();

	}

}

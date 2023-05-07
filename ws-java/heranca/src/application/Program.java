package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {
		
		Account acc = new Account(1001, "Alex", 0.0);
		BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.0);

				
	// UPCASTING
	// atribuir um obj BusinessAccount (subclasse) a um obj do tipo Account (superclasse)
	
	Account acc1 = bacc;
	acc1.getBalance(); // não dá erro pq a herança é uma relação 'é-um'. uma BusinessAccount é uma Account
	
	Account acc2 = new BusinessAccount(1003, "Anna", 0.0, 200.0);
	Account acc3 = new SavingsAccount(1004, "Bob", 0.0, 0.01);
	
	// DOWNCASTING
	// superclasse > subclasse
	
	//BusinessAccount acc4 = acc2; // erro - incompatibilidade de tipos. acc2 é do tipo Account mesmo sendo instanciada como BusinessAccount
	BusinessAccount acc5 = (BusinessAccount) acc2; // casting
	acc5.loan(100.0);
	
	//BusinessAccount acc6 = (BusinessAccount)acc3; // do tipo Account mas foi instanciada como SavingsAccount. operação NÃO permitida
	
	// testar com instanceof
	if(acc3 instanceof BusinessAccount) {
		
	}
	
	if(acc3 instanceof SavingsAccount) {
		
	}
	
	// aula Override
	
	Account account = new Account(01, "Alex", 1000.0);
	account.withdraw(200.0);
	System.out.println(account.getBalance());
	
	// lembrando que poderia ser account tb 
	SavingsAccount savingAccount = new SavingsAccount(02, "Anna", 1000.0, 0.01);
	savingAccount.withdraw(200.0);
	System.out.println(savingAccount.getBalance());
	
	
	Account business = new BusinessAccount(03, "Mario", 1000.0, 15000.0);
	business.withdraw(200.0);
	System.out.println(business.getBalance());
	
	}
	
	

}

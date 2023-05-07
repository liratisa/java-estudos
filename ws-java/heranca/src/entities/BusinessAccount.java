package entities;

public class BusinessAccount extends Account {
	
	private Double loanLimit;
	
	public BusinessAccount() {
		super();
	}

	public BusinessAccount(Integer number, String holder, Double balance, Double loanLimit) {
	// super: aproveita a lógica do construtor da superclasse
		super(number, holder, balance);
		this.loanLimit = loanLimit;
	}

	public Double getLoanLimit() {
		return loanLimit;
	}

	public void setLoanLimit(Double loanLimit) {
		this.loanLimit = loanLimit;
	}
	
	// herda métodos da superclasse
	public void loan(double amount) {
		if(amount <= loanLimit) {
			deposit(amount);			
		}
	}
	
	// em contas do tipo businessAccount, além do desconto de 5.0, tb tem o desconto de 2.0
	// utilizar super para implementação da superclasse
	
	@Override 
	public void withdraw(double amount) {
		// super: realiza o mesmo método
		super.withdraw(amount);
		// indica a especificação
		balance -= 2.0;
	}
	
}

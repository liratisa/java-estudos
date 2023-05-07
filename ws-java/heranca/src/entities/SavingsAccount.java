package entities;

// palavra FINAL - evita que sejam criadas subclasses de savingsAccount
public final class SavingsAccount extends Account {
	
	private Double interestRate;
	
	public SavingsAccount() {
		super();
	}

	public SavingsAccount(Integer number, String holder, Double balance, Double interestRate) {
		super(number, holder, balance);
		this.interestRate = interestRate;
	}

	public Double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(Double interestRate) {
		this.interestRate = interestRate;
	}
	
	public void updateBalance() {
		balance += balance * interestRate;
	}
	
	// sobreposição de métodos - se a conta for do tipo savingaccount, não cobra a taxa de 5.0
	// anotação Override indica sobreposição ao compilador
	// palavra FINAL no método - tb evita que seja sobreposto
	
	@Override	
	public final void withdraw(double amount) {
		balance -= amount;
	}
}

package entities;

public class ContaBancaria {	
	
	private int conta;
	private String titular;
	private double saldo;
	
	public ContaBancaria(int conta, String titular, double saldo) {
		super();
		this.conta = conta;
		this.titular = titular;
		this.saldo = saldo;
	}
	
	public ContaBancaria(int conta, String titular) {
		super();
		this.conta = conta;
		this.titular = titular;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public double getSaldo() {
		return saldo;
	}	

	public int getConta() {
		return conta;
	}
	
	public void saque(double saldo) {
		this.saldo -= saldo + 5.00;
	}
	
	public void deposito(double valor) {
		this.saldo += valor;
	}

	@Override
	public String toString() {
		return "Conta " + conta + ", Titular: " + titular + ", Saldo: R$ " + saldo + "";
	}
	
	
	
	

}

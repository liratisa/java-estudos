package util;

public class CurrencyConverter {
	
	public static double IOF = 0.06;
	
	public static double currencyConverted(double amount, double dollarPrice) {
		return amount * dollarPrice * (1 + IOF);
	}
	
	
}

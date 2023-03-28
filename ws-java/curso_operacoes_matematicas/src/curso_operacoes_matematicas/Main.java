package curso_operacoes_matematicas;

import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		double x = 3.0;
		double y = 4.0;
		double z = -5.0;
		
		double A, B, C;
		
		A = Math.sqrt(x);
		B = Math.sqrt(y);
		C = Math.sqrt(25.0);
		
		System.out.println("Raiz quadrada de " + x + " é igual a: " + A );
		Locale.setDefault(Locale.US);
		System.out.printf("Raiz quadrada de %.1f é igual a: %.3f \n", x, A);
		System.out.println("Raiz quadrada de " + y + " é igual a: " + B );
		System.out.println("Raiz quadrada de 25" + " é igual a: " + C );
		
		A = Math.pow(x, y);
		B = Math.pow(x, 2.0);
		C = Math.pow(5.0, 2.0);
		System.out.println(x + " elevado a: " + y + " é igual a: " + A);
		System.out.println(x + " elevado a: 2.0 é igual a: " + B);
		System.out.println("5.0 elevado a: 2.0 é igual a: " + C);
		
		A = Math.abs(y);
		B = Math.abs(z);
		System.out.println("Valor absoluto de " + y + ":" + A);
		System.out.println("Valor absoluto de " + z + ":" + B);
	}

}

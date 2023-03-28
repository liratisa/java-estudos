import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//Locale.setDefault(Locale.US); // formatar no padrão US
		double y = 1.55123456;
		//System.out.printf("%.4f%n", y); //f: formatado
		//System.out.println("O valor é " + y); //ln: quebra de linha
	
		String nome = "Maria";
		int idade = 31;
		double renda = 4000.0;
		
		//System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);
		
		String product1 = "Computer";
		String product2 = "Office desk";
		
		int age = 30;
		int code = 5290;
		char gender = 'F';
		
		double price1 = 2100.0;
		double price2 = 650.50;
		double measure = 53.234567;
		
			
		System.out.printf("%s, which price is $ %.2f%n", product1, price1);
		System.out.printf("%s, which price is $ %.2f%n", product2, price2);
		System.out.printf("Record: %d years old, code %d and gender: %c%n", age, code, gender);
		System.out.printf("Measure with eight decimal places: %.8f%n", measure);
		System.out.printf("Rounded (three decimal places): %.3f%n", measure);
		
		Locale.setDefault(Locale.US);
		System.out.printf("US decimal point: %.3f", measure);
		
		int a, b;
		double resultado;
		
		a = 5;
		b = 2;
		
		
		resultado = (double) a/b; //casting
		
		System.out.println(resultado);
		
		// criar obj do tipo scanner
		
		Scanner sc = new Scanner(System.in);
		
		String x;
		int y2;
		
		System.out.println("Digita qq coisa ai");
		
		x = sc.next(); //uma palavra apenas
		
		y2 = sc.nextInt();	
		
		
		System.out.println("Printado palavra:" + x + "\n" + "Printado numero: " + y2);
		sc.close(); //fecha o scanner
		
		// prox linha
		String p1, p2, p3;
		
		p1 = sc.nextLine(); // le a linha completa
		p2 = sc.nextLine();
		p3 = sc.nextLine();
		
		
	}
	

}

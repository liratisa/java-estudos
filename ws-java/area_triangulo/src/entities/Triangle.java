package entities; // pacote da classe

public class Triangle {
	// public significa que pode ser usado em outros arquivos
	// atributos:
	public double a, b,c;
	
	//criando método
	//() - lista de parâmetros do método
	// double - tipo de retorno do método (se não retornar nada, colocar void)
	public double area() {
		double p = a + b + c / 2.0;
		return Math.sqrt(p * (p - a) * (p - b) * (p - c));
	};
}

package entities;

public class Media {
	public String name;
	public double n1, n2, n3;
	
	
	public double calculoMedia() {
		return n1 + n2 + n3;
	}
	
	//calcula só os pontos que faltam
	public double mediaFinal() {
		if(calculoMedia() <= 60.0) {
			return 60.0 - calculoMedia();
		} else {
			return calculoMedia();
		}
	}
	
	
}

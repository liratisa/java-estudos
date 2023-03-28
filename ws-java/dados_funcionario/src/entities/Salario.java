package entities;

public class Salario {
	public String name;
	public double grossSalary, tax;
	
	public double netSalary() {
		return grossSalary - tax;
	}
	
	public void increaseSalary(double percentage) {
		this.grossSalary += grossSalary * (percentage / 100);
	}
	
	public String toString() {
		return name + ", " + "$ " + netSalary();
	}
}

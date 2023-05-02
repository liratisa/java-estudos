package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Department;
import entities.HourContract;
import entities.Worker;
import entities.enums.WorkerLevel;

public class Program {
	
	// pode gerar exceção
	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);		
		Scanner sc = new Scanner(System.in);
		
		// receber data
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.print("Enter department's name: ");
		String deptName = sc.nextLine();		
		System.out.println("Enter worker data:");
		System.out.print("Name: ");
		String workerName = sc.nextLine();
		System.out.print("Level: ");
		String workerLevel = sc.nextLine();
		System.out.print("Base salary: ");
		double baseSalary = sc.nextDouble();
		
		
		// instanciando novo objeto do tipo worker
		// enum - usar valueOf para retornar valor da constante
		// departamento - outro obj associado ao obj worker
		Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel), baseSalary, new Department(deptName));
		
		System.out.print("How many contracts to this worker? ");
		int n = sc.nextInt();
		sc.nextLine();
		
		for(int i = 0; i < n; i++) {
			System.out.println("Enter contract #" + (i + 1) + " data: ");
			System.out.print("Date (DD/MM/YYYY): ");
			Date contractDate = sdf.parse(sc.next());
			System.out.print("Value per hour: $");
			double valuePerHour = sc.nextDouble();
			System.out.print("Duration (hours): ");
			int hours = sc.nextInt();
			
			HourContract contract = new HourContract(contractDate, valuePerHour, hours);
			
			// associar esse contrato ao trabalhador
			worker.addContract(contract);	
			
		}		
		
		System.out.println();
		System.out.print("Enter month and year to calculate the income (MM/YYYY): ");
		String monthAndYear = sc.next();
		// recortando a string e transformando em int 
		int month = Integer.parseInt(monthAndYear.substring(0, 2));
		int year = Integer.parseInt(monthAndYear.substring(3));
	
		
		System.out.println("Name: " + worker.getName());
		// acessa obj worker > acessa department (outro obj) > nome
		System.out.println("Department: " + worker.getDepartment().getName());
		System.out.println("Income for " + monthAndYear + ": " + String.format("%.2f", worker.income(year, month)));
		
		sc.close();

	}

}

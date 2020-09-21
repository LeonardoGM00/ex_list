package exer_list;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employees;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Employees> list = new ArrayList<>();
		
		System.out.println("how many employees will be registered ? ");
		int n = sc.nextInt();
		System.out.println();
		
		for(int i=1; i<=n; i++) {
			System.out.printf("Employee #%s:%n", i);
			
			System.out.print("Id:");
			Integer id = sc.nextInt();
			while (hasId(list, id)) {
				System.out.print("Id already taken. try again: ");
			}
			sc.nextLine();
			System.out.println("Name:");
			String name = sc.nextLine();
			System.out.print("Salary:");
			Double salary = sc.nextDouble();
			list.add(new Employees(name, salary,id));
		}
		
		System.out.println("Enter the employee id tha whill have salary increase: ");
		int id = sc.nextInt();
		Employees emp = list.parallelStream().filter(x -> x.getId() == id).findFirst().orElse(null);
			
		if (emp == null) {
			System.out.println("This id does exist!");
		}
		else {
			System.out.println("Enter the percentage: ");
			double percentage = sc.nextDouble();
			emp.increaseSalary(percentage);
		}
		
		System.out.println();
		System.out.println("List of employees: ");
		for (Employees obj : list) {
			System.out.println(obj);
		}
		
		sc.close();
	}
	
	public static boolean hasId(List<Employees> list, int id) {
		Employees emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return emp != null;
	}

}

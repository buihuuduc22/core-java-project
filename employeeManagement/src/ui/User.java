package ui;

import java.util.ArrayList;
import java.util.Scanner;

import business.ManagementEmployee;
import entity.Employee;

public class User {
	public static void display(ArrayList<Employee> listE) {
		for (Employee e : listE) {
			System.out.println(e);
		}
	}
	
	public static void main(String[] args) {
		ManagementEmployee man = new ManagementEmployee();
		Scanner scan = new Scanner(System.in);
		boolean keepRuning = true;
		while (keepRuning) {
			System.out.println("Management employee 1.0");
			System.out.println("\t1.Add employee");
			System.out.println("\t2.search employee by name");
			System.out.println("\t3.display all employee");
			System.out.println("\t4.exit");
			System.out.println("------------------------------------------------------------------");
			int choice = scan.nextInt();
			switch (choice) {
			case 1:
				Employee emp = man.createEmp();
				man.add(emp);
				System.out.println("------------------------------------------------------------------");
				break;
			case 2:
				scan = new Scanner(System.in);
				System.out.print("enter name: ");
				String name = scan.nextLine();
				ArrayList<Employee> foundEmp = man.searchByName(name);
				System.out.println("");
				display(foundEmp);
				System.out.println("------------------------------------------------------------------");
				break;
			case 3: 
				ArrayList<Employee> listE = man.listAll();
				display(listE);
				System.out.println("------------------------------------------------------------------");
				break;
			case 4:
				keepRuning = false;
			
			}
		}
	}
}

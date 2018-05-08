package business;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;

import entity.EGender;
import entity.Employee;
import entity.Engineer;
import entity.Staff;
import entity.Worker;

public class ManagementEmployee {
	ArrayList<Employee> listE;
	public ManagementEmployee() {
		//store employees
		listE = new ArrayList<>();
	}
	//create common details of employee
	private static void create(Employee e) {
		Scanner scan = new Scanner(System.in);
		//full name;
		System.out.print("Full Name: ");
		e.setFullName(scan.nextLine());
		//set Date of birth
		boolean checkExeption = true;
		while (checkExeption) {
			try {
				System.out.print("Date of birth: ");
				scan = new Scanner(System.in);
				String input = scan.nextLine();
				SimpleDateFormat sdf = new SimpleDateFormat("dd/M/yyyy");
				Date birth = sdf.parse(input);
				e.setBirth(birth);
				checkExeption = false;
			} catch (ParseException k) {
				System.out.println("Date of birth format: dd/M/yyyy");
			}
		}
		//Gender
		checkExeption = true;
		while (checkExeption) {
			try {
				System.out.print("Gender(1:MALE, 2:FEMALE): ");
				scan = new Scanner(System.in);
				int gender = scan.nextInt();
				if(gender==1) e.setGender(EGender.MALE);
				if(gender==2) e.setGender(EGender.FEMALE);
				checkExeption = false;
			} catch (InputMismatchException e2) {
				System.out.println("Choice 1 or 2");
			}
		}
		//address
		System.out.print("Address: ");
		scan = new Scanner(System.in);
		e.setAddress(scan.nextLine());
	}
	//create worker/
	public Employee createEmp() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Create employee: ");
		System.out.println("\ta-for worker");
		System.out.println("\tb-for engineer");
		System.out.println("\tc-for staff");
		String choice = scan.next();
		//details of worker
		if (choice.equalsIgnoreCase("a")) {
			Worker w = new Worker();
			create(w);//common details
			//level
			boolean checkException = true;
			while (checkException) {
				try {
					System.out.print("level(3,4,5,6,7): ");
					scan = new Scanner(System.in);
					int c = scan.nextInt();
					w.setLevel(c);
					checkException = false;
				} catch (InputMismatchException e) {
					System.out.println("level is 3,4,5,6,7");
				}
			}
			return w;
		//details of engineer
		}else if (choice.equalsIgnoreCase("b")) {
			Engineer e = new Engineer();
			create(e);//common details
			//specialize
			scan = new Scanner(System.in);
			System.out.print("Secialize: ");
			e.setSpecialized(scan.nextLine());
			return e;
		//details of staff
		}else if (choice.equalsIgnoreCase("c")) {
			Staff s = new Staff();
			create(s);//common details
			//task
			scan = new Scanner(System.in);
			System.out.print("Task: ");
			s.setTask(scan.nextLine());
			return s;
		}
		return null;
	}
	//add employee
	public void add(Employee emp) {
		listE.add(emp);
	}
	//search by name
	public ArrayList<Employee> searchByName(String name) {
		ArrayList<Employee> foundEmp = new ArrayList<Employee>();
		for (Employee e : listE) {
			if (e.getFullName().contains(name)) {
				foundEmp.add(e);
			}
		}
		return foundEmp;
	}
	//list all
	public ArrayList<Employee> listAll() {
		Collections.sort(listE);
		return listE;
	}
	
}

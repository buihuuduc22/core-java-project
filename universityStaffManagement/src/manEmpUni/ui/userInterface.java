package manEmpUni.ui;

import java.io.File;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import manEmpUni.business.AllowanceCalculator;
import manEmpUni.business.EmployeeManagement;
import manEmpUni.entity.EDegree;
import manEmpUni.entity.EPosition;
import manEmpUni.entity.Employee;
import manEmpUni.entity.Staff;
import manEmpUni.entity.Teacher;

public class userInterface {
	//create an employee by input it's attribute value form keyboard
	public static Employee createNewEmp() {
		System.out.println("Create Staff or Teacher (enter s for Staff, otherwise for Teacher");
		//Accept Staff or Teacher details from keyboard
		Scanner scan = new Scanner(System.in);
		String choice = scan.nextLine();
		if (choice.equalsIgnoreCase("s")) {
			Staff s = new Staff();
			//input Staff details
			
			//1.full name
			System.out.print("Full name: ");
			s.setFullName(scan.nextLine());
			//2.department
			System.out.print("Department: ");
			s.setDepartment(scan.nextLine());
			
			while (true) {//retype if data type input wrong
				try {
					//3.salary ratio
					System.out.print("Salary ratio: ");
					scan = new Scanner(System.in);
					s.setSalaryRatio(scan.nextFloat());
					//4.position
					System.out.print("Position (1=HEAD, 2=VICE-HEAD, 3=STAFF) : ");
					scan = new Scanner(System.in);
					int Pchoice = scan.nextInt();
					if(Pchoice==1) s.setPosition(EPosition.HEAD);
					if(Pchoice==2) s.setPosition(EPosition.VICE_HEAD);
					if(Pchoice==3) s.setPosition(EPosition.STAFF);
					//5.number of working day
					System.out.print("Number of working day: ");
					scan = new Scanner(System.in);
					s.setWorkingDay(scan.nextFloat());
					return s;
				} catch (InputMismatchException e) {
					System.out.println("Warning: ");
					System.out.println("\t1.salary ratio shoul be a number");
					System.out.println("\t2.choice position should be 1,2,3");
					System.out.println("\t3.working days should be a number");
					System.out.println("Please retype");
					continue;
				}
			}
		}else {
			Teacher t = new Teacher();
			//input Teacher details
			//1.full name
			System.out.print("Full Name: ");
			t.setFullName(scan.nextLine());
			//2.faculty
			System.out.print("Faculty: ");
			scan = new Scanner(System.in);
			t.setFaculty(scan.nextLine());
			while (true) {//retype if salary ratio not a float
				try {
					//3.salary ratio
					System.out.print("Salary ratio: ");
					scan = new Scanner(System.in);
					t.setSalaryRatio(scan.nextFloat());
					//4.degree
					System.out.print("Degree (1=BACHELOR, 2=MASTER, 3=DOCTOR): ");
					scan = new Scanner(System.in);
					int Dchoice = scan.nextInt();
					if(Dchoice==1) t.setDegree(EDegree.Balance);
					if(Dchoice==2) t.setDegree(EDegree.Master);
					if(Dchoice==3) t.setDegree(EDegree.Doctor);
					//5.teaching hour
					System.out.print("Teaching hour: ");
					scan = new Scanner(System.in);
					t.setTeachingHour(scan.nextFloat());
					return t;
				} catch (InputMismatchException e) {
					System.out.println("Warning: ");
					System.out.println("\t1.salary ratio shoul be a number");
					System.out.println("\t2.choice degree should be 1,2,3");
					System.out.println("\t3.teaching hours should be a number");
					System.out.println("Please retype");
					continue;
				}
			}
		}
	}
	//display a list of employee
	static void display(ArrayList<Employee> listE) {
		System.out.println("Name, Fac/Dept, Deg/Pos, Sal Ratio, Allowance, T.Hours/W.Days, Salary");
		for (Employee e : listE) {
			System.out.println(e);
		}
	}
	
	public static void main(String[] args) {
		//create employee management object
		EmployeeManagement eMan = new EmployeeManagement();
		Scanner scan = new Scanner(System.in);
		boolean keepRuning = true;
		while (keepRuning) {
			//check text file exit
			String fileName = "data.txt";
			File file = new File(fileName);
			if(file.exists() && eMan.listAll().isEmpty())
				eMan.load(fileName);
			if(!file.exists())
				System.out.println("*****Load data: "+fileName+" file not found.");
			
			//menu
			System.out.println("UNIVERSITY STAFF MANAGEMENT 1.0");
			System.out.println("\t1.Add staff");
			System.out.println("\t2.Searich staff by name");
			System.out.println("\t3.Search staff by department/faculty");
			System.out.println("\t4.Display all staff");
			System.out.println("\t5.Exit");
			System.out.print("Select function (1,2,3,4,5): ");
			int choice = scan.nextInt();
			System.out.println("-------------------------------------------------------------------");
			switch (choice) {
			case 1://add staff/teacher
				Employee emp = createNewEmp();
				float allowance = AllowanceCalculator.calculateAllowance(emp);
				emp.setAllowance(allowance);
				eMan.addEmployee(emp);
				eMan.save(emp, fileName);
				System.out.println("-------------------------------------------------------------------");
				break;
			case 2://search by name
				System.out.print("\tEnter a name to search: ");
				scan = new Scanner(System.in);
				String name = scan.nextLine();
				ArrayList<Employee> foundByName = eMan.searchByName(name);
				display(foundByName);
				System.out.println("-------------------------------------------------------------------");
				break;
			case 3://search by department
				System.out.println("\tEnter department: ");
				scan = new Scanner(System.in);
				String dept = scan.nextLine();
				ArrayList<Employee> foundDept = eMan.searchByDept(dept);
				display(foundDept);
				System.out.println("-------------------------------------------------------------------");
				break;
			case 4://display all
				ArrayList<Employee> listE = eMan.listAll();
				display(listE);
				System.out.println("-------------------------------------------------------------------");
				break;
			case 5://exit
				keepRuning = false;
			}
		}
	}
}

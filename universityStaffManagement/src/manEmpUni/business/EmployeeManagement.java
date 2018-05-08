package manEmpUni.business;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

import manEmpUni.entity.EDegree;
import manEmpUni.entity.EPosition;
import manEmpUni.entity.Employee;
import manEmpUni.entity.Staff;
import manEmpUni.entity.Teacher;

public class EmployeeManagement {
	//store all staff/teacher
	ArrayList<Employee> listE;
	public EmployeeManagement() {
		listE = new ArrayList<>();
	}
	public void addEmployee(Employee emp) {
		//add emp to list
		listE.add(emp);
	}
	//search staff/teacher's name
	public ArrayList<Employee> searchByName(String name) {
		//store all of staff/teacher match
		ArrayList<Employee> empFound = new ArrayList<Employee>();
		for (Employee e : listE) {
			if(e.getFullName().contains(name)) empFound.add(e);
		}
		return empFound;
	}
	//search by staff/teacher's department/faculty
	public ArrayList<Employee> searchByDept(String dept) {
		//store all of staff/teacher match
		ArrayList<Employee> empFound = new ArrayList<Employee>();
		for (Employee e : listE) {
			if (e instanceof Staff) {
				Staff s = (Staff) e;
				if(s.getDepartment().contains(dept)) empFound.add(e);
			}
		}
		return empFound;
	}
	public ArrayList<Employee> listAll() {
		Collections.sort(listE);
		return listE;
	}
	//save data
	public void save(Employee emp, String fileName) {
		BufferedWriter bw = null;
		try {
			File file = new File(fileName);
			if(!file.exists()) file.createNewFile();
			bw = new BufferedWriter(new FileWriter(file,true));
			if(emp instanceof Teacher) bw.write("Teacher, "+emp.toString());
			if(emp instanceof Staff) bw.write("Staff, "+emp.toString());
			bw.newLine();
		} catch (IOException e) {
			System.out.println(e);
		}finally {
			try {
				if(bw!=null) bw.close();
			} catch (Exception e2) {
				System.out.println("Error in close file writer"+e2);
			}
		}
	}
	//load data
	public void load(String fileName) {
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader(fileName));
			String line;
			while ((line=br.readLine())!=null) {
				String[] data = line.split(",\\s");
				if (data[0].equalsIgnoreCase("Staff")) {
					Staff s = new Staff();
					s.setFullName(data[1]);
					s.setDepartment(data[2]);
					//load position
					if(data[3].equals("HEAD")) s.setPosition(EPosition.HEAD);
					if(data[3].equals("VICE_HEAD")) s.setPosition(EPosition.VICE_HEAD);
					if(data[3].equals("STAFF")) s.setPosition(EPosition.STAFF);
					//load salary ratio
					float salaryRatio = Float.parseFloat(data[4]);
					s.setSalaryRatio(salaryRatio);
					//load allowance
					float allowance = Float.parseFloat(data[5]);
					s.setAllowance(allowance);
					//load working day
					float workingDay = Float.parseFloat(data[5]);
					s.setWorkingDay(workingDay);
					//add staff to list
					addEmployee(s);
				}
				if (data[0].equalsIgnoreCase("Teacher")) {
					Teacher t = new Teacher();
					//load name
					t.setFullName(data[1]);
					//load faculty
					t.setFaculty(data[2]);
					//load degree
					if(data[3].equals("Balance")) t.setDegree(EDegree.Balance);
					if(data[3].equals("Master")) t.setDegree(EDegree.Master);
					if(data[3].equals("Doctor")) t.setDegree(EDegree.Doctor);
					//load salary ratio
					float salaryRatio = Float.parseFloat(data[4]);
					t.setSalaryRatio(salaryRatio);
					//load allowance
					float allowance = Float.parseFloat(data[5]);
					t.setAllowance(allowance);
					//load working day
					float teachingHour = Float.parseFloat(data[5]);
					t.setTeachingHour(teachingHour);
					//add staff to list
					addEmployee(t);
				}
			}
		} catch (IOException e) {
			System.out.println(e);
		}finally {
			try {
				if(br!=null) br.close();
			} catch (Exception e2) {
				System.out.println("error in close reader"+e2);
			}
		}
	}
}

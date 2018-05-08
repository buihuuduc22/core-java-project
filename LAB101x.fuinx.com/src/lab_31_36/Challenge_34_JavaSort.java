package lab_31_36;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Challenge_34_JavaSort {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		//input number of test cases;
		System.out.print("input number of test case: ");
		int testCases = Integer.parseInt(in.nextLine());
		//store students
		List<Student> studentList = new ArrayList<Student>();
		
		while (testCases > 0) {
			//details of student
			System.out.print("ID: ");
			int id = in.nextInt();
			System.out.print("First name: ");
			String fname = in.next();
			System.out.print("CGPA: ");
			double cgpa = in.nextDouble();
			Student st = new Student(id, fname, cgpa);
			//add student
			studentList.add(st);
			//sort students
			Collections.sort(studentList, new Student());
			testCases--;
			System.out.println("----------------------------------");
		}
		//display students
		for (Student st : studentList) {
			System.out.println(st.getFname());
		}
	}

}

class Student implements Comparator<Student> {
	private String fname;
	private int id;
	private double cgpa;

	public Student(int id, String fname, double cgpa) {
		this.fname = fname;
		this.id = id;
		this.cgpa = cgpa;
	}
	
	public Student() {
	}

	public String getFname() {
		return fname;
	}

	public int getId() {
		return id;
	}

	public double getCgpa() {
		return cgpa;
	}

	@Override
	public int compare(Student s1, Student s2) {
		//compare two student to sort descending by cgpa
		if (s1.getCgpa() > s2.getCgpa()) {
			return -1;
		} else if (s1.getCgpa() < s2.getCgpa()) {
			return 1;
		}
		//compare by name if cgpa equally
		if (s1.getCgpa() - s2.getCgpa() < Math.abs(0.01)) {
			return s1.getFname().compareTo(s2.getFname());
		}
		return s1.getId() - s2.getId();
	}

}

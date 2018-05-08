package manEmpUni.entity;

public class Teacher extends Employee{
	private String faculty;//khoa
	private EDegree degree;//trình độ
	private float teachingHour;//số tiết dạy

	public String getFaculty() {
		return faculty;
	}

	public void setFaculty(String faculty) {
		this.faculty = faculty;
	}

	public EDegree getDegree() {
		return degree;
	}

	public void setDegree(EDegree degree) {
		this.degree = degree;
	}

	public float getTeachingHour() {
		return teachingHour;
	}

	public void setTeachingHour(float teachingHour) {
		this.teachingHour = teachingHour;
	}
	//Hệ số lương*730+phụ cấp+số tiết dạy*45.
	@Override
	public float getSalary() {
		return this.getSalaryRatio()*730+this.getAllowance()+this.getTeachingHour()*45;
	}
	@Override
	public String toString() {
		return 
		this.getFullName()+", "+
        this.getFaculty()+", "+
        this.getDegree()+", "+
        this.getSalaryRatio()+", "+
        this.getAllowance()+", "+
        this.getTeachingHour()+", "+
        this.getSalary();    
	}
}

package entity;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Employee implements Comparable<Employee>{
	private String fullName;
	private Date birth;
	private EGender gender;
	private String address;
	
	public void setAddress(String address) {
		this.address = address;
	}
	public String getAddress() {
		return address;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public Date getBirth() {
		return birth;
	}
	public void setBirth(Date birth) {
		this.birth = birth;
	}
	public EGender getGender() {
		return gender;
	}
	public void setGender(EGender sex) {
		this.gender = sex;
	}
	@Override
	public String toString() {
		String birth = new SimpleDateFormat("dd/M/yyyy").format(this.getBirth());
		return
				this.getFullName()+", "+
				birth+", "+
				this.getGender()+", "+
				this.getAddress();
	}
	
	//compare by full name
	@Override
	public int compareTo(Employee emp) {
		return this.fullName.compareTo(emp.fullName);
	}
}

package manEmpUni.entity;

public abstract class Employee implements Comparable<Employee> {
	private String fullName;//h�? tên
	private float salaryRatio;//hệ số lương
	private float allowance;//phụ cấp

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public float getSalaryRatio() {
		return salaryRatio;
	}

	public void setSalaryRatio(float salaryRatio) {
		this.salaryRatio = salaryRatio;
	}

	public float getAllowance() {
		return allowance;
	}

	public void setAllowance(float allowance) {
		this.allowance = allowance;
	}

	public abstract float getSalary();

	@Override
	public int compareTo(Employee emp) {
		this.fullName.compareTo(emp.fullName);
		return 0;
	}
}

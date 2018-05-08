package manEmpUni.entity;

public class Staff extends Employee {
	private String department;// phòng ban
	private EPosition position;// chức vị
	private float workingDay;// số ngày làm việc trong tháng

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public EPosition getPosition() {
		return position;
	}

	public void setPosition(EPosition position) {
		this.position = position;
	}

	public float getWorkingDay() {
		return workingDay;
	}

	public void setWorkingDay(float workingDay) {
		this.workingDay = workingDay;
	}

	// Hệ số lương*730+phụ cấp+số ngày công*30;
	@Override
	public float getSalary() {
		return this.getSalaryRatio() * 730 + this.getAllowance()
				+ this.getWorkingDay() * 30;
	}

	@Override
	public String toString() {
		return this.getFullName() + ", " + this.getDepartment() + ", "
				+ this.getPosition() + ", " + this.getSalaryRatio() + ", "
				+ this.getAllowance() + ", " + this.getWorkingDay() + ", "
				+ this.getSalary();
	}
}

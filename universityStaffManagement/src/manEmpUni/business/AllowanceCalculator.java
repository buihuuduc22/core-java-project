package manEmpUni.business;

import manEmpUni.entity.EDegree;
import manEmpUni.entity.EPosition;
import manEmpUni.entity.Employee;
import manEmpUni.entity.Staff;
import manEmpUni.entity.Teacher;

public class AllowanceCalculator {
	/*for teacher:
	bachelor/cử nhân: 300
	Master/thạc sỹ:500
	Doctor/tiến sỹ:1000
	for staff:
	Head/trưởng phòng: 2000
	vice-head/phó phòng: 1000
	employee/nhân viên: 500*/
	public static float calculateAllowance(Employee emp) {
		float allowance = 0;
		if (emp instanceof Staff) {
			Staff s = (Staff) emp;
			if(s.getPosition()==EPosition.HEAD) allowance = 2000;
			if(s.getPosition()==EPosition.VICE_HEAD) allowance = 1000;
			if(s.getPosition()==EPosition.STAFF) allowance = 500;
		}
		if(emp instanceof Teacher){
			Teacher t = (Teacher) emp;
			if(t.getDegree()==EDegree.Balance) allowance = 300;
			if(t.getDegree()==EDegree.Master) allowance = 500;
			if(t.getDegree()==EDegree.Doctor) allowance = 1000;
		}
		return allowance;
	}
}

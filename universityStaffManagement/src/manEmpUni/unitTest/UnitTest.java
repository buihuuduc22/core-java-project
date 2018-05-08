package manEmpUni.unitTest;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Test;

import manEmpUni.business.AllowanceCalculator;
import manEmpUni.business.EmployeeManagement;
import manEmpUni.entity.EPosition;
import manEmpUni.entity.Employee;
import manEmpUni.entity.Staff;
import manEmpUni.entity.Teacher;
import manEmpUni.ui.userInterface;

public class UnitTest {
	EmployeeManagement man = new EmployeeManagement();
	Staff s = new Staff();
	Teacher t = new Teacher();
	@Test
	public void testSearchByName() {
		Employee emp = userInterface.createNewEmp();
		//create staff expect
		s.setFullName("Bui Huu Duc");
		s.setDepartment("IT");
		s.setPosition(EPosition.HEAD);
		s.setAllowance(2000);
		s.setSalaryRatio(2);
		s.setWorkingDay(30);
		//name expect
		String nameEx = s.getFullName();
		float allowance = AllowanceCalculator.calculateAllowance(emp);
		//run method
		emp.setAllowance(allowance);
		man.addEmployee(emp);
		ArrayList<Employee> listResult = man.searchByName("uc");
		//name result
		String nameResult = listResult.get(0).getFullName();
		assertEquals(nameEx, nameResult);
	}
	@Test
	public void testSalary() {
		//create teacher
		t.setAllowance(1000);
		t.setSalaryRatio(3);
		t.setTeachingHour(15);
		//create staff
		s.setAllowance(2000);
		s.setSalaryRatio(2);
		s.setWorkingDay(30);
		//salary for staff
		// Hệ số lương*730+phụ cấp+số ngày công*30;
		float sStaff = 2*730+2000+30*30;
		//salary for teacher
		//Hệ số lương*730+phụ cấp+số tiết dạy*45.
		float sTeacher =  3*730+1000+15*45;
		assertEquals(sStaff, s.getSalary(), 0.05);
		assertEquals(sTeacher, t.getSalary(), 0.05);
	}

}

package org.ems.employee.service;

import java.util.List;

import org.ems.employee.model.Employee;
import org.ems.employee.model.LeaveRequest;

public interface EmployeeService {
	void addEmployee(Employee employee);
	List<Employee> getAllEmployee();
	void deleteEmployee(Long id);

	Employee getEmployeeById(Long id);
	void UpdateEmployee(Employee emp);

	List<LeaveRequest> getAllLeaveRequest();

	List<LeaveRequest> getLeaveRequestByEmployeeId(String id);

	LeaveRequest getLeaveRequestById(Long id);

	void AddLeaveRequest(LeaveRequest leave);
	void UpdateLeaveRequest(LeaveRequest leave);
	//Login authenticate
	public Employee authenticateEmployee(String email, String password);
}

package in.lti.service;

import java.util.List;

import in.lti.entity.Employee;

public interface IEmployeeService {

	Long createEmployee(Employee employee);
	List<Employee> findAllEmployees();
	Employee findOneEmployee(Long id);
	void deleteOneEmployee(Long id);
	void updateEmployee(Employee emp);
	int updateEmployeeName(String ename, Long eid);
}

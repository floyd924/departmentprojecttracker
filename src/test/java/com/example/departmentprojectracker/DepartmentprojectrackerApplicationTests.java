package com.example.departmentprojectracker;

import com.example.departmentprojectracker.models.*;
import com.example.departmentprojectracker.repositories.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DepartmentprojectrackerApplicationTests {

	@Autowired
	EmployeeRepository employeeRepository;

	@Autowired
	ProjectRepository projectRepository;

	@Autowired
	DepartmentRepository departmentRepository;

	@Test
	public void contextLoads() {
	}

	@Test
	public void createEmployeeAndDepartment() {
		Department department = new Department("DevTeam");
		departmentRepository.save(department);

		Employee employee = new Employee("Barry", "Chuckle", 8, department);
		employeeRepository.save(employee);
	}


	@Test
	public void addEmployeeAndProject() {
		Department department = new Department("Engineering");
		departmentRepository.save(department);

		Employee employee = new Employee("Barry", "Chuckle", 8, department);
		employeeRepository.save(employee);

		Project project = new Project("CalculatorJave", 2);
		project.addEmployee(employee);
		projectRepository.save(project);
	}
}

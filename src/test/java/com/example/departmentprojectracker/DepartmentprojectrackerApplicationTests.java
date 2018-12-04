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


//	@Test
//	public void createPirateAndShip(){
//		Ship ship = new Ship("The Flying Dutchman");
//		shipRepository.save(ship);
//
//		Pirate pirate1 = new Pirate("Jack", "Sparrow", 32, ship);
//		pirateRepository.save(pirate1);
//	}
//
//	@Test
//	public void addPiratesAndRaids(){
//		Ship ship = new Ship("The Flying Dutchman");
//		shipRepository.save(ship);
//
//		Pirate pirate1 = new Pirate("Jack", "Sparrow", 32, ship);
//		pirateRepository.save(pirate1);
//
//		Raid raid1 = new Raid("Tortuga", 100);
//		raidRepository.save(raid1);
//
//		raid1.addPirate(pirate1);
//		raidRepository.save(raid1);
//
//	}

}

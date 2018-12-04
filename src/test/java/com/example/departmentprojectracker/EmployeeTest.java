package com.example.departmentprojectracker;

import com.example.departmentprojectracker.models.Department;
import com.example.departmentprojectracker.models.Employee;
import com.example.departmentprojectracker.models.Project;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EmployeeTest {

    Employee employee;
    Project project;
    Department department;

    @Before
    public void before() {
        department = new Department("Finance");
        employee = new Employee("Barry", "Johnson", 4, department );
        project = new Project("Java", 6);
    }


    @Test
    public void canAdd(){
        employee.addProject(project);
        assertEquals(1, employee.getProjects().size());
    }
}

package org.example.MyDreamProject.service;

import org.example.MyDreamProject.domain.Employee;
import org.example.MyDreamProject.repos.EmployeeRepo;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


class EmployeeServiceTest {

    EmployeeRepo employeeRepo = mock(EmployeeRepo.class);

    EmployeeService employeeService = new EmployeeService(employeeRepo);

    @Test
    void createEmployee() {
        Employee employee = new Employee("Jack");
        when(employeeRepo.save(any(Employee.class))).thenReturn(employee);
        Employee employeeSaved = employeeRepo.save(employee);
        assertEquals(employeeSaved.getfullName(), employee.getfullName());
    }

}
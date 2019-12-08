package org.example.MyDreamProject.service;

import org.example.MyDreamProject.domain.Department;
import org.example.MyDreamProject.domain.Employee;
import org.example.MyDreamProject.repos.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
    private final EmployeeRepo employeeRepo;

    public EmployeeService(EmployeeRepo employeeRepo) {
        this.employeeRepo = employeeRepo;
    }

    public void createEmployee(String fullName, Department department) {
        Employee employee = new Employee(fullName);
        employee.setDepartment(department);
        employeeRepo.save(employee);
    }

    public void deleteEmployee(Employee employee) {
        employeeRepo.delete(employee);
    }

}

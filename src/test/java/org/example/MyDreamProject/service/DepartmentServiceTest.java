package org.example.MyDreamProject.service;

import org.example.MyDreamProject.domain.Department;
import org.example.MyDreamProject.domain.Employee;
import org.example.MyDreamProject.repos.DepartmentRepo;
import org.example.MyDreamProject.repos.EmployeeRepo;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class DepartmentServiceTest {

    DepartmentRepo departmentRepo = mock(DepartmentRepo.class);

    DepartmentService departmentService = new DepartmentService(departmentRepo);

    @Test
    void createEmployee() {
        Department department = new Department("HR");
        when(departmentRepo.save(any(Department.class))).thenReturn(department);
        Department departmentSaved = departmentRepo.save(department);
        assertEquals(departmentSaved.getName(), department.getName());
    }

}
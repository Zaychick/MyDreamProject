package org.example.MyDreamProject.service;

import org.example.MyDreamProject.domain.Department;
import org.example.MyDreamProject.repos.DepartmentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class DepartmentService {
    private final DepartmentRepo departmentRepo;

    public DepartmentService(DepartmentRepo departmentRepo) {
        this.departmentRepo = departmentRepo;
    }

    public Iterable<Department> getDepartments() {
        return departmentRepo.findAll();
    }

    public void createDepartment(String name) {
        Department department = new Department(name);
        departmentRepo.save(department);
    }

    public void deleteDepartment(Department department) {
        departmentRepo.delete(department);
    }
}

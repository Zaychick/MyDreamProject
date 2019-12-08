package org.example.MyDreamProject.controller;

import org.example.MyDreamProject.domain.Department;
import org.example.MyDreamProject.domain.Employee;
import org.example.MyDreamProject.repos.DepartmentRepo;
import org.example.MyDreamProject.repos.EmployeeRepo;
import org.example.MyDreamProject.service.DepartmentService;
import org.example.MyDreamProject.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

import java.util.Map;

@Controller
public class MainController {
    @Autowired
    private DepartmentService departmentService;

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/")
    public String getDepartments(Map<String, Object> model) {
        Iterable<Department> departments = departmentService.getDepartments();
        model.put("departments", departments);
        return "main";
    }

    @PostMapping("/addEmployee")
    public RedirectView addEmployee(@RequestParam String fullName, @RequestParam Department department) {
        employeeService.createEmployee(fullName, department);
        return new RedirectView("/");
    }

    @PostMapping("/addDepartment")
    public RedirectView addDepartment(@RequestParam String name) {
        departmentService.createDepartment(name);
        return new RedirectView("/");
    }

    @PostMapping("/deleteEmployee")
    public RedirectView deleteEmployee(@RequestParam Employee employee) {
        employeeService.deleteEmployee(employee);
        return new RedirectView("/");
    }

    @PostMapping("/deleteDepartment")
    public RedirectView deleteDepartment(@RequestParam Department department) {
        departmentService.deleteDepartment(department);
        return new RedirectView("/");
    }
}
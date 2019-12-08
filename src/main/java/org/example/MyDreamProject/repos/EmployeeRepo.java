package org.example.MyDreamProject.repos;

import org.example.MyDreamProject.domain.Employee;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepo extends CrudRepository<Employee, Integer> {
}

package org.example.MyDreamProject.repos;

import org.example.MyDreamProject.domain.Department;
import org.springframework.data.repository.CrudRepository;

public interface DepartmentRepo extends CrudRepository<Department, Integer> {
}

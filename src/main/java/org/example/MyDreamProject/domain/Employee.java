package org.example.MyDreamProject.domain;

import javax.persistence.*;
import java.io.Serializable;


@Entity
public class Employee implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String fullName;

    @ManyToOne
    private Department department;

    public Employee() {
    }

    public Employee(String fullname) {
        this.fullName = fullname;
    }


    public void setfullName(String fullname) {
        this.fullName=fullname;
    }

    public String getfullName() {
        return fullName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public Department getDepartment(){
        return department;
    }

}

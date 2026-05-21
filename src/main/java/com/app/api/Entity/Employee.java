package com.app.api.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "employee") 
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name = "username")
    private String empUsername;

    @Column(name = "password")
    private String empPassword;

    @Column(name = "emp_status")
    private String empStatus;

    @Column(name = "emp_name")
    private String empName;

    @Column(name = "emp_surname")
    private String empSurname;


    public String getEmpStatus() {
        return empStatus;
    }

    public void setEmpStatus(String empStatus) {
        this.empStatus  = empStatus;
    }

    // Getters and setters
    public Long getId() 
    { 
        return id; 
    }

    public void setId(Long id) 
    {
         this.id = id; 
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpSurname() {
        return empSurname;
    }

    public void setEmpSurname(String empSurname) {
        this.empSurname = empSurname;
    }

    public String getEmpUsername() {
        return empUsername;
    }

    public void setEmpUsername(String empUsername) {
        this.empUsername = empUsername;
    }

    public String getEmpPassword() {
        return empPassword;
    }

    public void setEmpPassword(String empPassword) {
        this.empPassword = empPassword;
    }
    

}
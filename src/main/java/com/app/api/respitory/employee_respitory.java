package com.app.api.respitory;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.api.Entity.Employee;

import java.util.Optional;

public interface employee_respitory extends JpaRepository<Employee, Long> 
{
    Optional<Employee> findByEmpUsernameAndEmpPassword(String empUsername, String empPassword);
}
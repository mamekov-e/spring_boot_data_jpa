package com.example.spring_boot_data_jpa.dao;

import com.example.spring_boot_data_jpa.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}

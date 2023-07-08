package com.example.spring_boot_data_jpa.service;

import com.example.spring_boot_data_jpa.dao.EmployeeRepository;
import com.example.spring_boot_data_jpa.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    public List<Employee> getAllEmployee() {
        return employeeRepository.findAll();
    }

    public Employee getEmployeeById(int id) {
        Employee employee = null;
        Optional<Employee> optionalEmployee = employeeRepository.findById(id);

        if (optionalEmployee.isPresent()) {
            employee = optionalEmployee.get();
        }
        return employee;
    }

    public void saveEmployee(Employee employee) {
        employeeRepository.save(employee);
    }

    public void deleteEmployeeById(int id) {
        employeeRepository.deleteById(id);
    }
}

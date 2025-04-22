package com.sultan.spring.mvc_hibernate_aop.service;

import com.sultan.spring.mvc_hibernate_aop.entity.Employee;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeSeriveImpl implements EmployeeService {
    @Override
    public List<Employee> getAllEmployees() {
        return null;
    }
}

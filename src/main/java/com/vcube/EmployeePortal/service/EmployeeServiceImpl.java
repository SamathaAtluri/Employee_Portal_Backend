package com.vcube.EmployeePortal.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vcube.EmployeePortal.model.Employee;
import com.vcube.EmployeePortal.repo.EmployeeRepo;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    EmployeeRepo employeeRepo;

    @Override
    public Employee addEmployee(Employee employee) {
        return employeeRepo.save(employee);
    }

    @Override
    public List<Employee> getAllEmployeesInfo() {
        return employeeRepo.findAll();
    }

    @Override
    public Employee getEmployee(Integer id) {
        Optional<Employee> employee = employeeRepo.findById(id);
        return employee.orElse(null);
    }

    @Override
    public Employee updateEmployee(Employee e, Integer id) {
        Optional<Employee> employee = employeeRepo.findById(id);

        if (employee.isPresent()) {
            Employee old = employee.get();

            old.setFirstName(e.getFirstName());
            old.setLastName(e.getLastName());
            old.setEmail(e.getEmail());
            old.setMobilenumber(e.getMobilenumber());
            old.setAge(e.getAge());
            old.setDepartment(e.getDepartment());
            old.setDesignation(e.getDesignation());
            old.setSalary(e.getSalary());
            old.setJoiningDate(e.getJoiningDate());
            old.setStatus(e.getStatus());

            return employeeRepo.save(old);
        }

        return null;
    }

    @Override
    public void deleteEmployee(Integer id) {
        employeeRepo.deleteById(id);
    }
}

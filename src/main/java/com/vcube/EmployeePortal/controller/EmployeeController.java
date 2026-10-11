
package com.vcube.EmployeePortal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.vcube.EmployeePortal.model.Employee;
import com.vcube.EmployeePortal.service.EmployeeService;

@RestController
@RequestMapping("/employee")
@CrossOrigin(origins = "http://localhost:5173")
public class EmployeeController {

    @Autowired
    EmployeeService employeeservice;

    @PostMapping("/add")
    public Employee addEmployee(@RequestBody Employee employee) {
        return employeeservice.addEmployee(employee);
    }

    @GetMapping("/all")
    public List<Employee> getAllEmployeesInfo() {
        return employeeservice.getAllEmployeesInfo();
    }

    @GetMapping("/{id}")
    public Employee getEmployee(@PathVariable Integer id) {
        return employeeservice.getEmployee(id);
    }

    @PutMapping("/update/{id}")
    public Employee updateEmployee(
            @RequestBody Employee employee,
            @PathVariable Integer id) {
        return employeeservice.updateEmployee(employee, id);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteEmployee(@PathVariable Integer id) {
        employeeservice.deleteEmployee(id);
        return "Employee deleted successfully";
    }
}

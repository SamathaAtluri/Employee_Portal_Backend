package com.vcube.EmployeePortal.repo;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vcube.EmployeePortal.model.Employee;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee,Integer>{

}

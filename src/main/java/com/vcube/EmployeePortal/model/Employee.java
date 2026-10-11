package com.vcube.EmployeePortal.model;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "Employee")
@Setter
@Getter
@NoArgsConstructor
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	Integer empno;
	String firstName;
	String lastName;
	String email;
	String mobilenumber;
	Short age;
	String department;
	String designation;
	Double salary;
	LocalDate joiningDate;
	String status = "Active";

}

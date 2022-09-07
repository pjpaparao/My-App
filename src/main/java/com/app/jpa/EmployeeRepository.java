package com.app.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long>  {
	
//	@Modifying
//	@Query("update Employee u set u.dob=:emp.dob,u.salary = :emp.salary , u.lastName = :emp.lastName ,u.firstName = :emp.firstName  where u.id = :id")
//	void updateEmp(@Param(value = "id") long id, @Param(value = "emp") Employee emp);

}


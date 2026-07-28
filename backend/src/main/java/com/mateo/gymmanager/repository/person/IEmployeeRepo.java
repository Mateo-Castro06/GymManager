package com.mateo.gymmanager.repository.person;

import com.mateo.gymmanager.entity.person.employee.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IEmployeeRepo extends JpaRepository<Employee, Long> {
}

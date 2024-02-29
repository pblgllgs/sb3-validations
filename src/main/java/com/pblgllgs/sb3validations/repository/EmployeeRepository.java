package com.pblgllgs.sb3validations.repository;

import com.pblgllgs.sb3validations.entity.Employee;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepository extends CrudRepository<Employee, Long> {
}

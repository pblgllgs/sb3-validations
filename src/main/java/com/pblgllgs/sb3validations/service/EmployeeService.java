package com.pblgllgs.sb3validations.service;
/*
 *
 * @author pblgl
 * Created on 28-02-2024
 *
 */

import com.pblgllgs.sb3validations.dto.EmployeeDto;
import com.pblgllgs.sb3validations.entity.Department;
import com.pblgllgs.sb3validations.entity.Employee;
import com.pblgllgs.sb3validations.repository.EmployeeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EmployeeService {

    private final EmployeeRepository employeeRepository;

    public Employee saveEmployee(EmployeeDto employeeDto) {
        Employee employee = Employee.builder()
                .firstName(employeeDto.firstName())
                .lastName(employeeDto.lastName())
                .email(employeeDto.email())
                .phone(employeeDto.phone())
                .age(employeeDto.age())
                .height(employeeDto.height())
                .married(employeeDto.married())
                .dateOfBirth(employeeDto.dateOfBirth())
                .department(Department.builder()
                        .name(employeeDto.departmentDto().name())
                        .city(employeeDto.departmentDto().city())
                        .build())
                .build();

        return employeeRepository.save(employee);
    }
}

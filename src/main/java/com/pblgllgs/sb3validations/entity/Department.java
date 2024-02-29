package com.pblgllgs.sb3validations.entity;
/*
 *
 * @author pblgl
 * Created on 28-02-2024
 *
 */

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String city;
    @OneToMany(mappedBy = "department", targetEntity = Employee.class, fetch = FetchType.LAZY)
    @JsonBackReference
    List<Employee> employees;
}

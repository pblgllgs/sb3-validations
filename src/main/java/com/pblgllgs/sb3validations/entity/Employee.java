package com.pblgllgs.sb3validations.entity;
/*
 *
 * @author pblgl
 * Created on 28-02-2024
 *
 */

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    private String email;
    private Long phone;
    private byte age;
    private double height;
    private boolean married;
    @Column(name = "date_of_birth")
    private LocalDate dateOfBirth;
    @ManyToOne(
            fetch = FetchType.EAGER,
            targetEntity = Department.class,
            cascade = CascadeType.PERSIST
    )
    private Department department;
}

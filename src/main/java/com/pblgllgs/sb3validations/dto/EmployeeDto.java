package com.pblgllgs.sb3validations.dto;

import com.pblgllgs.sb3validations.advice.customvalidation.anotation.ValidName;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;

import java.time.LocalDate;

public record EmployeeDto(
        @ValidName
        String firstName,
        @NotBlank String lastName,
        @Pattern(regexp = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$", message = "email invalido") String email,

        @Max(value = 9999999999L, message = "numero invalido")
        @Min(value = 1000000000L, message = "numero invalido")
        Long phone,
        @Min(value = 18, message = "debe tener al menos 18 años")
        @Max(value = 99, message = "debe tener menos de 99 años")
        byte age,
        @Digits(
                integer = 1,
                fraction = 2,
                message = "Formato invalido, debe ser ej: 1.70 mtrs"
        )
        double height,
        @AssertFalse
        boolean married,
        @Past(message = "Fecha invalida")
        LocalDate dateOfBirth,
        @Valid
        DepartmentDto departmentDto

) {
}

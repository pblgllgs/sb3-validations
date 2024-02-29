package com.pblgllgs.sb3validations.dto;
/*
 *
 * @author pblgl
 * Created on 28-02-2024
 *
 */

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import org.springframework.validation.annotation.Validated;

@Validated
public record DepartmentDto(

        @NotBlank
        @Size(min = 3, max = 20, message = "El nombre debe tener minimo 3 caracteres y maximo 20")
        String name,
        @NotBlank
        @Size(min = 3, max = 20, message = "El nombre debe tener minimo 3 caracteres y maximo 30")
        String city
) {
}

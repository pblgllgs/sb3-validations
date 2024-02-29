package com.pblgllgs.sb3validations.advice.customvalidation.anotation;
/*
 *
 * @author pblgl
 * Created on 29-02-2024
 *
 */

import com.pblgllgs.sb3validations.advice.customvalidation.validator.ValidNameValidator;
import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = ValidNameValidator.class)
@Target({ElementType.METHOD,ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface ValidName {

    String message() default "{custom.validation.message}";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};


}

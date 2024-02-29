package com.pblgllgs.sb3validations.advice.customvalidation.validator;
/*
 *
 * @author pblgl
 * Created on 29-02-2024
 *
 */

import com.pblgllgs.sb3validations.advice.customvalidation.anotation.ValidName;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class ValidNameValidator implements ConstraintValidator<ValidName, String> {
    @Override
    public void initialize(ValidName constraintAnnotation) {
        ConstraintValidator.super.initialize(constraintAnnotation);
    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext constraintValidatorContext) {
        if (value == null) {
            return false;
        }

        if (value.isEmpty()) {
            return false;
        }

        if (value.length() > 20 || value.length()<3) {
            return false;
        }

        if (!Character.isUpperCase(value.charAt(0))) {
            return false;
        }

        return true;
    }
}

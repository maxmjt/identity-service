package com.example.identity.service.rest.validation;

import com.example.identity.service.annotations.ValidPassword;
import org.springframework.beans.factory.annotation.Autowired;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * @author Max.Jimenez
 */
public class PasswordConstraintValidator implements ConstraintValidator<ValidPassword, String> {

    @Autowired
    private PasswordConfig passwordConfig;

    private String passwordPattern;

    @Override
    public void initialize(ValidPassword constraintAnnotation) {
        this.passwordPattern = passwordConfig.getPasswordPattern();
    }

    @Override
    public boolean isValid(String password, ConstraintValidatorContext context) {
        if (password == null) {
            return false;
        }
        return password.matches(passwordPattern);
    }
}

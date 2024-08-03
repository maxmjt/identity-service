package com.example.identity.service.rest.validation;


import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Component
public class PasswordConfig {

    @Value("${password.pattern}")
    private String passwordPattern;

}

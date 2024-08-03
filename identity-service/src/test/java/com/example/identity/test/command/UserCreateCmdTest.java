package com.example.identity.test.command;

import com.example.identity.service.api.input.UserInput;
import com.example.identity.service.command.user.UserCreateCmd;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

/**
 * @author Max.Jimenez
 */
@ExtendWith(MockitoExtension.class)
public class UserCreateCmdTest {

    private UserInput userInput;

    @InjectMocks
    private UserCreateCmd userCreateCmd;

    @BeforeEach
    public void setUp() {
        // Si es necesario, inicializa las dependencias aquí
        userInput = new UserInput();
        userInput.setName("Max");
        userInput.setEmail("max@gmail.com");
        userInput.setPassword("Password123!!");
    }

    @Test
    public void testUserCreateCmd() {
        // TODO:  Implementation is pending
    }
}

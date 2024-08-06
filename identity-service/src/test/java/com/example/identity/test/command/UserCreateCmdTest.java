package com.example.identity.test.command;

import com.example.identity.persistence.entity.UserEntity;
import com.example.identity.service.api.input.UserInput;
import com.example.identity.service.command.user.UserCreateCmd;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

/**
 * @author Max.Jimenez
 */
@ExtendWith(MockitoExtension.class)
public class UserCreateCmdTest {

    private UserInput userInput;

    @Mock
    private UserCreateCmd userCreateCmd;

    @BeforeEach
    public void setUp() {
        userInput = new UserInput();
        userInput.setName("Max");
        userInput.setEmail("max@gmail.com");
        userInput.setPassword("Password123!!");
    }

    @Test
    @DisplayName("Create user")
    public void testUserCreateCmd() {
        userCreateCmd.setInput(userInput);
        userCreateCmd.execute();
        UserEntity userResponse = userCreateCmd.getUserEntity();

        Assertions.assertNotNull(userResponse, "Response should not be null");
    }
}

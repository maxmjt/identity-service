package com.example.identity.service.rest;

import com.example.identity.service.api.builder.UserResponseBuilder;
import com.example.identity.service.api.common.factory.ResourceBuilder;
import com.example.identity.service.api.input.UserInput;
import com.example.identity.service.command.user.UserCreateCmd;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.annotation.RequestScope;

import javax.validation.Valid;

/**
 * @author Max Jimenez
 */
@RequestMapping(value = Constants.BasePath.USERS)
@RequestScope
@RestController
public class UserCreateController {

    private UserCreateCmd userCreateCmd;

    public UserCreateController(UserCreateCmd userCreateCmd) {
        this.userCreateCmd = userCreateCmd;
    }

    @Operation(
            summary = "Create user",
            description = "Create user",
            tags = Constants.ItendityTag.NAME)
    @ApiResponses({
            @ApiResponse(
                    responseCode = Constants.HttpStatus.BAD_REQUEST,
                    description = "El correo ya registrado"
            )
    })
    @PostMapping(
            value = "/users"
    )
    public ResponseEntity createUser(@Valid @RequestBody UserInput input) {

        userCreateCmd.setInput(input);
        userCreateCmd.execute();

        return ResponseEntity.ok(ResourceBuilder.getInstance()
                .setCode(HttpStatus.OK.value())
                .build(UserResponseBuilder.getInstance(userCreateCmd.getUserEntity()).build()));
    }
}

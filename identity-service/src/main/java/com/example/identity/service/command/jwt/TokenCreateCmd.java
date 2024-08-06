package com.example.identity.service.command.jwt;

import com.example.identity.service.annotations.SynchronousExecution;
import com.example.identity.service.core.BussinessLogicCommad;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Max.Jimenez
 */
@SynchronousExecution
public class TokenCreateCmd implements BussinessLogicCommad {

    private static final String SECRET_KEY = "mySecretKeyByIdentityService";
    private static final long EXPIRATION_TIME = 86400000;

    @Setter
    private String userName;

    @Getter
    private String token;

    public TokenCreateCmd() {
    }

    @Override
    public void execute() {
        token = generateToken();
    }

    private String generateToken() {
        Map<String, Object> claims = new HashMap<>();

        return Jwts.builder()
                .setClaims(claims)
                .setSubject(userName)
                .setIssuedAt(new Date(System.currentTimeMillis()))
                .setExpiration(new Date(System.currentTimeMillis() + EXPIRATION_TIME))
                .signWith(SignatureAlgorithm.HS512, SECRET_KEY)
                .compact();
    }
}

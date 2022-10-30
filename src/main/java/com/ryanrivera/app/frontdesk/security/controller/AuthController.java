package com.ryanrivera.app.frontdesk.security.controller;

import com.ryanrivera.app.frontdesk.security.service.JwtTokenResponse;
import com.ryanrivera.app.frontdesk.security.service.TokenService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Controller that generates the JWT Token
 */
@Slf4j
@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
public class AuthController {

    private final TokenService tokenService;

    @PostMapping("/user")
    public ResponseEntity<JwtTokenResponse> getUserToken(Authentication auth){
        log.debug("Requesting for {} user for token.", auth.getName());
        final String token = tokenService.generateToken(auth);
        final JwtTokenResponse response = new JwtTokenResponse();
        response.setJwt(token);
        return ResponseEntity.ok(response);
    }
}

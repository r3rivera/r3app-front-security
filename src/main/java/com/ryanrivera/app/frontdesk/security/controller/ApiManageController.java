package com.ryanrivera.app.frontdesk.security.controller;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ApiManageController {

    @GetMapping("/security")
    public ResponseEntity<String> handleAppSecurity(){
        return ResponseEntity.ok("Security is up");
    }
}

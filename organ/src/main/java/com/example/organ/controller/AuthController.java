package com.example.organ.controller;

import com.example.organ.dtos.AuthResponse;
import com.example.organ.dtos.RegisterRequest;
import com.example.organ.service.AuthenticationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.security.NoSuchAlgorithmException;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

    @Autowired
    private AuthenticationService authService;

    @PostMapping("/register")
    public ResponseEntity<AuthResponse> register(@RequestBody RegisterRequest request) throws NoSuchAlgorithmException {
        return ResponseEntity.ok(authService.register(request));
    }

    @PostMapping("/login")
    public ResponseEntity<AuthResponse> login(@RequestBody RegisterRequest request) throws NoSuchAlgorithmException {
        return ResponseEntity.ok(authService.login(request));
    }

}

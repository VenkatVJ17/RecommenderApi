package com.venkatscode.springboot.recommender_api.controllers;

import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/user")
public class UserController {
    @GetMapping("/info")
    public String getUserInfo(Authentication authentication) {
        return "Hello, " + authentication.getName() + "! This is a protected resource.";
    }
}

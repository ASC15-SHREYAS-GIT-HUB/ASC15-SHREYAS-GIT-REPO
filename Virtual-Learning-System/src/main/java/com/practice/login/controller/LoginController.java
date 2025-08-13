package com.practice.login.controller;

import com.practice.login.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api/login")
public class LoginController {
    private final LoginService loginService;

    @Autowired
    public LoginController(LoginService loginService){
        this.loginService = loginService;
    }

    @PostMapping("/login")
    public String login(@RequestBody Map<String,String> payload ){
        Long id = Long.parseLong(payload.get("id"));
        String password = payload.get("password");

        boolean success = loginService.validLogin(id,password);
        return success ? "Login successful":"Invalid login";
    }
}

package com.northcoders.SecurityPlayground.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class SecurityController {

    @GetMapping("/open/greeting")
    public static String welcomeUser() {
       return "Welcome User";
    }

    @GetMapping("/protected/greeting")
    public static String welcomeAuthorisedUser() {
        return "Hiya User. Welcome to it all!";
    }

}

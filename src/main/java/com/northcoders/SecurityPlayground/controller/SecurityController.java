package com.northcoders.SecurityPlayground.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.user.OAuth2User;
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
    public static ResponseEntity<String> welcomeAuthorisedUser(@AuthenticationPrincipal OAuth2User principal) {
        String username = principal.getName();
        String name = principal.getAttribute("name");

        return new ResponseEntity<>("Hiya" + name + " your username is: " + username + ". Welcome to it all!", HttpStatus.OK);
    }

}

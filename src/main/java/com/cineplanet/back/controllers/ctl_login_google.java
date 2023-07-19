package com.cineplanet.back.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ctl_login_google {

    @GetMapping("/login")
    String login() {
        return "login";
    }
}

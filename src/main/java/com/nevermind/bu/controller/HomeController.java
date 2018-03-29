package com.nevermind.bu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String greeting() {
        return "hello";
    }

    @GetMapping("/login")
    public String loginPage() {
        return "loginPage";
    }


}

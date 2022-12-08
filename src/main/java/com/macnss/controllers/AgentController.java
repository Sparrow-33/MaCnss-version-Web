package com.macnss.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/agent")
public class AgentController {

    @PostMapping("/signIn")
    public String verification() {
        System.out.println("heeere");
        return "agent/verification";
    }
}

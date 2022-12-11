package com.macnss.controllers;


import com.macnss.entities.Agent;
import com.macnss.services.AgentService;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/agent")
public class AgentController {
    @Autowired
    private AgentService agentService;

    @PostMapping("/signIn")
    public String signIn(HttpServletRequest request, HttpServletResponse response) {

       String email = request.getParameter("email");
       String pwd = request.getParameter("password");
       if ( !agentService.signIn(email, pwd).equals(null)) {
           System.out.println("successful signIn");
       }
       return "agent/verification";
    }

    @PostMapping("/codeVerification")
    public String verification() {
        return "agent/dashboaed";
    }
}

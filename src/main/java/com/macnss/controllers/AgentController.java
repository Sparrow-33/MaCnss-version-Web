package com.macnss.controllers;


import com.macnss.entities.Agent;
import com.macnss.helper.Mail;
import com.macnss.helper.codeVerification;
import com.macnss.services.AgentService;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/agent")
public class AgentController {
    private String code;
    @Autowired
    private AgentService agentService;

    @PostMapping("/signIn")
    public String signIn(HttpServletRequest request, HttpServletResponse response) {

       String email = request.getParameter("email");
       String pwd = request.getParameter("password");
//       Agent agent = agentService.signIn(email, pwd);
//       if (agent != null) {
//            code =   codeVerification.codeGenerator();
//           Mail.sendMail("Votre code de verifiction : \n "+code, "Code de verification Macnss", "muiugfbne@mozmail.com");

           return "agent/verification";
//       }
//           return "index";
    }

    @PostMapping("/codeVerification")
    public String verification(HttpServletRequest request) {
//        String inputCode = request.getParameter("code");
//        if (codeVerification.verification(inputCode,this.code)) {
            return "redirect: dashboard";
//        }
//        return "agent/verification";
    }

    @GetMapping("/dashboard")
    public String dashboard() {
        return "agent/dashboard";
    }
}

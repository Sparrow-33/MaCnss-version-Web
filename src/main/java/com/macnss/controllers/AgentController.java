package com.macnss.controllers;


import com.macnss.entities.Agent;
import com.macnss.services.AgentService;
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
    public String verification() {
        List<Agent> agentList = agentService.getAgents();
        System.out.println(agentList.get(0).getEmail());
        System.out.println("heeere");
        return "agent/verification";
    }
}

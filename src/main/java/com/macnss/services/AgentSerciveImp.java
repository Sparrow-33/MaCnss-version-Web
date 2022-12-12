package com.macnss.services;

import com.macnss.entities.Agent;
import com.macnss.helper.PasswordManager;
import com.macnss.repositories.AgentRepo;
import jakarta.persistence.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class AgentSerciveImp implements AgentService{
    @Qualifier("agentRepo")
    @Autowired
    private AgentRepo agentRepo;


    @Override
    @Transactional
    public List<Agent> getAgents() {
        return agentRepo.findAll();
    }

    @Override
    @Transactional
    public void saveAgent(Agent agent) {
        agentRepo.save(agent);
    }

    @Override
    @Transactional
    public Agent signIn(String email, String password) {
        Agent agent = new Agent();
        agent = findByEmail(email, agent);
        if (agent != null) {
            if (PasswordManager.passwordVerify(password, agent.getPassword())) {
                return agent;
            }
            System.out.println("pwd mismatch");
        }
        System.out.println("email doesn't exist!");
        return null;
    }

    @Override
    @Transactional
    public Agent findByEmail(String email, Agent agent) {
         agent = agentRepo.findAgentByEmail(email);
        if( agent != null) {
            return agent;
        }
        return null;
    }




}

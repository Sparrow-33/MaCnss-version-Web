package com.macnss.services;

import com.macnss.entities.Agent;
import com.macnss.repositories.AgentRepo;
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
}

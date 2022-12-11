package com.macnss.services;

import com.macnss.entities.Agent;

import java.util.List;


public interface AgentService {
    public List<Agent> getAgents();
    public void saveAgent(Agent agent);
    public Agent signIn(String email, String password);
    public Agent findByEmail(String email, Agent agent);
}

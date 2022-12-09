package com.macnss.repositories;

import com.macnss.entities.Agent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository("agentRepo")
public interface AgentRepo extends JpaRepository<Agent, String> {

}

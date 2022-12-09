package servicesTest;

import com.macnss.entities.Agent;
import com.macnss.services.AgentService;
import junit.framework.TestCase;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class AgentSerciveImpTest extends TestCase {
    @Autowired
    private AgentService agentService;
    @Test
    public void testAgent() {

//        List<Agent> agents = agentService.getAgents();
        Agent agent = new Agent();
        agent.setEmail("new@cnss.ma");
        agent.setPassword("123456");
        agentService.saveAgent(agent);
    }

    @Test
    public void saveAgent() {
//        Agent agent = new Agent();
//        agent.setEmail("new@cnss.ma");
//        agent.setPassword("123456");
//        agentService.saveAgent(agent);
        System.out.println("here in test");
    }

}
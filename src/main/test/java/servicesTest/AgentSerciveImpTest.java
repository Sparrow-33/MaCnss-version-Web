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
        List<Agent> agents = agentService.getAgents();
    }

}
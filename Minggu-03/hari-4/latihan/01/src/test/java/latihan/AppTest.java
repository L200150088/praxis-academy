/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package latihan;

import org.junit.Test;
import static org.junit.Assert.*;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
 
import org.glassfish.grizzly.http.server.HttpServer;

public class AppTest {
    // @Test public void testAppHasAGreeting() {
    //     App classUnderTest = new App();
    //     assertNotNull("app should have a greeting", classUnderTest.getGreeting());
    // }
    
    private HttpServer server;
    private WebTarget target;

    public void setUp() throws Exception {
        server = Main.startServer();
 
        Client c = ClientBuilder.newClient();
        target = c.target(Main.BASE_URI);
    }
 
    @After
    public void tearDown() throws Exception {
        server.stop();
    }
 
    /**
     * Test to see that the message "Got it!" is sent in the response.
     */
    @Test
    public void testGetIt() {
        String responseMsg = target.path("myresource").request().get(String.class);
        assertEquals("Got it!", responseMsg);
    }
}

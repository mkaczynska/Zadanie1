import junit.framework.TestCase;

/**
 * Created by Madzia on 2016-03-02.
 */
public class ClientTest extends TestCase {

    public void setUp() throws Exception {
        super.setUp();
    }

    public void tearDown() throws Exception {

    }

    public void testGenMessage() throws Exception {
        int clientId = 0;
        Client client;

        client = new Client(clientId);
        assertEquals(client.getClientId(),clientId+1);
        assertEquals(client.genMessage(),Message.EMPTY);

        clientId = 2;
        client = new Client(clientId);
        assertEquals(client.getClientId(),clientId+1);
        assertEquals(client.genMessage(),Message.MAK);

        clientId = 4;
        client = new Client(clientId);
        assertEquals(client.getClientId(),clientId+1);
        assertEquals(client.genMessage(),Message.KWAK);

        clientId = 14;
        client = new Client(clientId);
        assertEquals(client.getClientId(),clientId+1);
        assertEquals(client.genMessage(),Message.MAKKWAK);

    }

    public void testShowMessage() throws Exception {
        Client client;
        int clientId = 0;
        String clientMessage;

        client = new Client(clientId);
        clientMessage = clientId+1 + ". client: " + Message.EMPTY;
        assertEquals(client.showMessage(),clientMessage);

        clientId = 2;
        client = new Client(clientId);
        clientMessage = clientId+1 + ". client: " + Message.MAK;
        assertEquals(client.showMessage(),clientMessage);

        clientId = 4;
        client = new Client(clientId);
        clientMessage = clientId+1 + ". client: " + Message.KWAK;
        assertEquals(client.showMessage(),clientMessage);

        clientId = 14;
        client = new Client(clientId);
        clientMessage = clientId+1 + ". client: " + Message.MAKKWAK;
        assertEquals(client.showMessage(),clientMessage);

    }
}
/**
 * Created by Madzia on 2016-03-02.
 */

class Client {
    private static final int THIRDCLIENT = 3;
    private static final int FIFTHCLIENT = 5;
    /**
     * Client message
     */
    private String message;
    /**
     * Client number
     */
    private int clientId;

    public Client(int clientNo) {
    clientId = clientNo + 1;
    message = "";
}
    public int getClientId() {
        return clientId;
    }

    /**
     * Method generates client message
     * @return client message
     */
    public String genMessage() {
        if (clientId % THIRDCLIENT == 0)
            message += Message.MAK;
        if (clientId % FIFTHCLIENT == 0)
            message += Message.KWAK;
        return message;
    }

    /**
     * Method shows client message for given client
     * @return client message with client number
     */
    public String showMessage() {
        String clientMessage = clientId + ". client: " +  genMessage();
        System.out.println(clientMessage);
        return clientMessage;
    }

}

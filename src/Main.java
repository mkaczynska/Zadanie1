/**
 * Created by Madzia on 2016-03-02.
 */
public class Main {
    public static void main(String[] args) {

        int clientCount = 20;
        for(int i=0; i<clientCount; i++) {
            Client client = new Client(i);
            client.showMessage();
        }

    }
}

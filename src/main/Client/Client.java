import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;


public class Client {
    public static void main(String[] args) {
        // Create a new client
        Client client = new Client();
        // Connect to the server
        client.connect();
        // Send a message to the server
        client.sendMessage("Hello, world!");
        // Disconnect from the server
        client.disconnect();
    }

    /**
     * connect to the server
     */
    private void connect() {
        try{
            Scanner scanner = new Scanner(System.in);
            Socket socket = null;
            try {
                socket = new Socket("cloud.lzuoss.club", 8888);
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                OutputStream os = socket.getOutputStream();
            } catch (IOException e) {
                e.printStackTrace();
            }
    }

}

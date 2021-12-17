/**
 * @author xuyuq
 */
package BackEnd;
import java.io.IOException;
import java.net.*;
import java.util.*;
public class Server extends Thread {
    public static void main(String[] args){
        try{
            ServerSocket serverSocket = new ServerSocket(8888);
            System.out.println("Server is starting...waiting for connection");
            while(true){
                /**
                 * Always receiving the client's request
                 */
                Socket client = serverSocket.accept();
                System.out.println("Client connected");
                BackEnd.ServerThread serverThread = new BackEnd.ServerThread(client);
                serverThread.start();
            }
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}

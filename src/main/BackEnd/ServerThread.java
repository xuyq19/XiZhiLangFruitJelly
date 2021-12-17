package BackEnd;
import Client.User;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.sql.Connection;

public class ServerThread extends Thread {
    private ServerSocket serverSocket;
    public static InputStream inputStream;
    public static OutputStream outputStream;
    static Client.User thisUser=null;
    static Connection connection=null;
    static String ClientAcc=null;
    static String ClientPassword=null;

    public ServerThread(Socket client) {
    }

    @Override
    public void run(){
        try{
            serverSocket = new ServerSocket(8888);
            while(true){
                Socket socket = serverSocket.accept();
                System.out.println("Client connected");
                Chat

            }


        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}

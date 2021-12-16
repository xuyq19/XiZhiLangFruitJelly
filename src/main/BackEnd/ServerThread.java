package BackEnd;
package java;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.*;
public class ServerThread extends Thread {
    private ServerSocket serverSocket;
    public static InputStream inputStream;
    public static OutputStream outputStream;
    static User thisUser=null;

}

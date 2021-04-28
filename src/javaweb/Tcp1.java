package javaweb;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Tcp1 {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket =new ServerSocket(5000);
        Socket accept = serverSocket.accept();
        InputStream inputStream = accept.getInputStream();
        byte [] bytes=new byte[1024];
        int read = inputStream.read(bytes);
        String s =new String(bytes,0,read);
        System.out.println(s);
        accept.close();
        serverSocket.close();



    }
}

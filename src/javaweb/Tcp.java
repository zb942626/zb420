package javaweb;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class Tcp {
    public static void main(String[] args) throws IOException {
        //Socket s =new Socket(InetAddress.getByName("192.168.0.55"),5000);
        Socket socket =new Socket("192.168.0.55",5000);
        OutputStream os = socket.getOutputStream();
        os.write("你好我来了".getBytes());
        socket.close();


    }
}

package javaweb;



import java.io.IOException;
import java.net.*;


public class UdpSend {
    public static void main(String[] args) throws IOException {
        DatagramSocket ds =new DatagramSocket();
        byte[]bytes ="你好".getBytes();
        InetAddress address = InetAddress.getByName("192.168.0.125");
        String hostAddress = address.getHostAddress();

        DatagramPacket dp=new DatagramPacket(bytes ,bytes.length,address,8000);
        ds.send(dp);
        ds.close();
    }
}

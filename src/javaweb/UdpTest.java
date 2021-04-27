package javaweb;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UdpTest {
    public static void main(String[] args) throws IOException {
        DatagramSocket ds =new DatagramSocket();

        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        String text ;
        while ((text=buffer.readLine())!=null){
            if ("886".equals(text)){
                break;
            }else {
                byte[]bytes=text.getBytes();
                DatagramPacket dp =new DatagramPacket(bytes,bytes.length, InetAddress.getByName("192.168.0.125"),6000);
                ds.send(dp);

            }
        }ds.close();
    }
}

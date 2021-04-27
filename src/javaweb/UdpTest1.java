package javaweb;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class UdpTest1 {
    public static void main(String[] args) throws IOException {
        DatagramSocket ds =new DatagramSocket(6000);
        while (true) {
            byte[] bytes = new byte[1024];
            DatagramPacket dp = new DatagramPacket(bytes, bytes.length);
            ds.receive(dp);
            byte[] data = dp.getData();
            String datas = new String(data, 0, dp.getLength());
            System.out.println(datas);
        }

    }
}

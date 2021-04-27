package javaweb;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UdpRevice {
    public static void main(String[] args) throws IOException {
        DatagramSocket ds =new DatagramSocket(8000);
        byte []bytes=new byte[1024];
        DatagramPacket dp=new DatagramPacket(bytes,bytes.length);
        ds.receive(dp);
        byte[] datas = dp.getData();
        int length = dp.getLength();
        String data = new String(datas,0,length);
        System.out.println(data);
        ds.close();
    }
}

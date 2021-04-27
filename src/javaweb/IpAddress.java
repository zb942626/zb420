package javaweb;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @author zhangmaomao
 */
public class IpAddress {
    public static void main(String[] args) throws UnknownHostException {

        InetAddress address= InetAddress.getByName("DESKTOP-DR0CEMO");
        String name = address.getHostName();
        String hostAddress = address.getHostAddress();
        System.out.println(name);
        System.out.println(hostAddress);
    }

}

package com.kly.ants.net;

import java.net.*;
import java.util.Enumeration;

/**
 * Description:
 * Company:changyou
 *
 * @author konglingyu
 * @Date 2020/2/11 16:52
 */
public class NetTest {
    public static void main(String[] args) {
        try {
            Enumeration<NetworkInterface> interfaceList = NetworkInterface.getNetworkInterfaces();
            if(interfaceList == null) {
                System.out.println("No Interfaces");
            } else {
                while(interfaceList.hasMoreElements()) {
                    NetworkInterface ni = interfaceList.nextElement();
                    Enumeration<InetAddress> addressList = ni.getInetAddresses();
                    while(addressList.hasMoreElements()) {
                        InetAddress ia = addressList.nextElement();
                        System.out.println("Interface:" + ni.getName() +
                                "----address:" + (ia instanceof Inet4Address ? "v4" : "v6" ) +
                                ia.getHostAddress() + ","+ ia.getHostName());
                    }
                }
            }
        } catch (SocketException e) {
            e.printStackTrace();
        }

        try {
            InetAddress[] addressArray = InetAddress.getAllByName("chong.changyou.com");
            for(InetAddress address : addressArray) {
                System.out.println(address.getHostAddress());
            }
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }

    }
}

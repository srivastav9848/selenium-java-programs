package ipadressdemo;

import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class GetIpAddress {
public static void main(String[] args) {
	try {
		InetAddress myip=Inet4Address.getLocalHost();
		System.out.println(myip.getHostAddress());
		System.out.println(myip.getHostName());
		System.out.println(myip.getCanonicalHostName());
	} catch (UnknownHostException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}

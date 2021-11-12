package bit_java1111;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class LocalComputerEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InetAddress inetaddr = null;
		try {
			inetaddr = InetAddress.getLocalHost();
		} catch(UnknownHostException e) {
			
		}
		System.out.println(inetaddr.getHostName());
		System.out.println(inetaddr.getHostAddress());
	}

}

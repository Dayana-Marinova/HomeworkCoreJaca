import java.net.*;
import java.util.*;
import static java.lang.System.out;


public class IPaddress {

	public static void main(String args[]) throws SocketException {
        Enumeration<NetworkInterface> nets = NetworkInterface.getNetworkInterfaces();
        for (NetworkInterface netint : Collections.list(nets))
            displayInterfaceInformation(netint);
    }

    static void displayInterfaceInformation(NetworkInterface netint) throws SocketException {
        out.printf("Name: %s\n", netint.getName());
        Enumeration<InetAddress> inetAddresses = netint.getInetAddresses();
        for (InetAddress inetAddress : Collections.list(inetAddresses)) {
        	if (inetAddress instanceof Inet4Address){
        		out.printf("InetAddress: %s\n", inetAddress);
        	}
        }
        out.printf("\n");
     }
}

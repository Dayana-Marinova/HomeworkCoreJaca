import java.io.IOException;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.UnknownHostException;


public class AllHosts {
	public static void main(String[] args) throws UnknownHostException, IOException {
		getAllHosts();
	}
	
	public static void getAllHosts() throws UnknownHostException, IOException{
		InetAddress localHost = Inet4Address.getLocalHost();
		String hostIP = localHost.getHostAddress();
		for (int i = 0; i < 255; i++){
			if(InetAddress.getByName(hostIP).isReachable(50)){
				System.out.println(hostIP + i);
			}
		}
	}
}

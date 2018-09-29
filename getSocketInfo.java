import java.net.*;
import java.io.*;
public class getSocketInfo {
	public static void main(String[] args) {
		try {
			Socket theSocket = new Socket("localhost",5000);
			System.out.println("Connected to "
					+ theSocket.getInetAddress() + " on port "
					+ theSocket.getPort() + " from port "
					+ theSocket.getLocalPort() + " of "
					+ theSocket.getLocalAddress());
		}
		
		catch (UnknownHostException e) {
		}
		
		catch (SocketException e) {
		}
		
		catch (IOException e) {
		}
	}

}

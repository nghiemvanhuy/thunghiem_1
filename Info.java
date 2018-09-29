import java.net.*;
class Info {
	public static void main(String[] args) {
		try {
			InetAddress[] addresses = InetAddress.getAllByName("www.facebook.com");
			for(int i = 0;i < addresses.length;i++)
				System.out.println(addresses[i]);
		}
		
		catch(UnknownHostException e) {
			System.out.println("Could not find www.hcmut.edu.vn");
		}
	}
}
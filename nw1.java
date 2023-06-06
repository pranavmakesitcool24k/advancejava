import java.net.*;
public class nw1
{
	public static void main(String[] args) throws UnknownHostException 
	{
		InetAddress Address = InetAddress.getLocalHost();
		System.out.println(Address);
		Address = InetAddress.getByName("www.PhoenixGlobe.com");
		System.out.println(Address);
		InetAddress add[] = InetAddress.getAllByName("www.Google.com");
		for (int i= 0;i<add.length;i++ ) 
		{	
			System.out.println(add[i]);
		}
	}
}
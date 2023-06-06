//URL - Uniform Resource Locator
import java.net.*;
class N2
{
	public static void main(String[] args) throws Exception
	{	
		try
		{
			URL ul = new URL("http://http://www.phonixglobe.com/testing.html");
			System.out.println("Protocol is :"+ul.getProtocol());
			System.out.println("Port is :"+ul.getPort());
			System.out.println("File is :"+ul.getFile());
			System.out.println("Host is :"+ul.getHost());
			System.out.println("String Representation is :"+ul.toString());
			System.out.println("Path is :"+ul.getPath());
		}
		catch(Exception e)
			{
				System.out.println(e);
				av}  
	}
}
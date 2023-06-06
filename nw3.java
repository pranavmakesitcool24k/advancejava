//Displaying source code of a web page by URLConnection class @pranav java version 1.8.0
import java.io.*;
import java.net.*;
public class URLConnectionDemo
{
	public static void main(String[] args) {
		try
		{
			URL urlobj = new URL("http://www.phoenixglobe.com/testing.html");
			URlConnection ucobj = urlobj.openConnection();
			InputStream is = ucobj.getInputStream();
			int i;
			while((i=is.read())!=-1)
			{
				System.out.println((char)i);
			}

		}catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
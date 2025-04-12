package practicejavaprogramtwo;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner;

public class FindIPAddress {
	public static void main(String[] args)  {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the website URL");
		
		String webSite=sc.nextLine();
		try {
		InetAddress ip=InetAddress.getByName(webSite);
		System.out.println("IP address of given website"+ip);
		}catch (UnknownHostException e) {
			System.out.println("Invalid url");
			e.printStackTrace();
		}
		
		
	}

}

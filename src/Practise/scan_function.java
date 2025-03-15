package Practise;

import java.util.Scanner;

public class scan_function {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String name=scan.nextLine();
		int Age=scan.nextInt();
		scan.nextLine();
		String Address=scan.nextLine();
		
		System.out.println("My name is : "+name);
		System.out.println("My Age is : "+Age);
		System.out.println("My Address is : "+Address);
	}

}

//Write a Program of basic string example and length method. gives string from user.

import java.util.Scanner;

class StringBasic
{
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter String:");
		String name = sc.nextLine();

		System.out.println("Name: "+ name);

		System.out.println("Length: "+name.length());
	}
}
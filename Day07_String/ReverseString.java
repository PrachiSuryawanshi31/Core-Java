//write a program of Reverse String.

import java.util.Scanner;

class ReverseString
{
	static String reverse(String str)
	{
		String rev =" "; //it make empty String to store  the reverse String 

		for(int i = str.length()-1; i >= 0; i--)
		{
			rev = rev + str.charAt(i);
		}

		return rev;
	}

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);

		System.out.println("Enter String : ");
		String s = sc.nextLine();

		System.out.println("Reverse: "+ reverse(s)); //reverse(s)-->its call method
	}
}
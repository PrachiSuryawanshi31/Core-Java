//Write a Java program to reverse a given number using a while loop.

import java.util.Scanner;

class ReverseNumber{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number:");
		int num = sc.nextInt();

		int reverse = 0;

		while(num > 0)
		{
			reverse = reverse * 10 + (num % 10);
			num = num / 10; 
		}

		System.out.println("Reverse Number : "+ reverse);
	}
}
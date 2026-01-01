// Create a Program to perfrom Factorial.

import java.util.Scanner;

class Factorial
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Calculate Factorial");

		System.out.println("Enter Number:");
		int ino1 = sc.nextInt();
		int factorial=1;

		for(int i = 1; i <= ino1 ; i++)
		{
			factorial=factorial *i;
		} 

		System.out.println("Factorial Number : "+factorial);
	}
}
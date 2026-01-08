//Write a Java program using methods to count even and odd numbers.

import java.util.Scanner;

class EvenOddCounter
{
	static boolean isEven(int num)
	{
		if(num % 2 == 0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}


	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("How many numbers: ");
		int n = sc.nextInt();
		int even = 0;
		int odd = 0;

		System.out.println("Enter Number:");
		for(int i = 1; i <= n; i++)
		{
			int num = sc.nextInt();

			if(isEven(num))
			{
				even = even + 1;
			}
			else
			{
				odd = odd + 1;
			}
		}

		System.out.println("Even Count =" +even);
		System.out.println("Odd Count = " +odd);
	}
}
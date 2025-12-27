
//Created Armstrong number validation program

import java.util.Scanner;

class ArmstrongNumberChecker
{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number:");
		int num = sc.nextInt();

		int temp = num;
		int sum = 0;

		while(temp > 0)
		{
			int digit = temp % 10;
			sum = sum + (digit * digit * digit);
			temp= temp /10 ;
		}

		if(sum == num)
		{
			System.out.println("ArmStrong Number");
		}
		else
		{
			System.out.println("Not an ArmStrong Number");
		}
	}
}
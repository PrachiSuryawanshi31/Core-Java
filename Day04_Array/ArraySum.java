//Write a Java program to find the sum of array

import java.util.Scanner;

class ArraySum
{
		static int getSum(int arr[])
		{
			int sum = 0;

			for(int i = 0; i < arr.length ; i++)
			{
				sum  =sum + arr[i];
			}

			return sum;
		}


	public static void main(String[] args) {
		
		int arr[] = {10,20,30,40};

		System.out.println("Sum =" + getSum(arr));	
	}
}
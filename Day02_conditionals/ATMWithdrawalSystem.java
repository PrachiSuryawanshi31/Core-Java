
import java.util.Scanner;

class ATMWithdrawalSystem
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double balance = 10000;

		System.out.println("Enter withdrewal amount:");
		double amount = sc.nextDouble();

		if(amount > 0)
		{
			if(amount <= balance)
			{
				if(amount % 100 == 0)
				{
					balance -=amount;
					System.out.println("withdrewal Successfuly!");

					System.out.println("Remaining Balance :" +balance);
				}
				else
				 {
					System.out.println("Amount must b multiple of 100");
				 }
			}
			 else
			 {
				System.out.println("Insufficient balance");
			 }
			
			}
			else
			{
				System.out.println("Invalid withdrewal amount");
			}
			
		}
}


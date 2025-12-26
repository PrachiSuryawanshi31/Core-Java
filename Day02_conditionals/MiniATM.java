
import java.util.Scanner;

class MiniATM
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double balance = 10000;

		System.out.println("---------ATM Menu-------");
		System.out.println("1. Check Balance");
		System.out.println("2.Deposit Money");
		System.out.println("3.Withdraw Money");
		System.out.println("4.Exit");

		System.out.println("Choose an option: ");
		int choice = sc.nextInt();

		switch(choice)
		{
		case 1:
			System.out.println("Your balance is : RS" +balance);
			break;

		case 2:
			System.out.println("Enter amount to deposit:");
			double deposite=sc.nextDouble();
			balance += deposite;

			System.out.println("Amount deposited Successfully");
			System.out.println("Updated balance : RS"+balance);
			break;

		case 3:
			System.out.println("Enter amount to Withdraw");

			double withdraw =sc.nextDouble();

			if(withdraw <= balance)
			{
				balance -= withdraw;
				System.out.println("please collect your cash");
				System.out.println("Remaining Balance: RS"+balance);
			}
			else
			{
				System.out.println("Insufficient balance");	
			}

			break;

		case 4:
			System.out.println("Thank You for using ATM");
			break;

		default:
			System.out.println("Invalid option selscted");
		}
	}
}
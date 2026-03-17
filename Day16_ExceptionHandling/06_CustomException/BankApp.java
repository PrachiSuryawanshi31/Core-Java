import java.util.Scanner;

class InsufficientBalanceException extends Exception
{
	InsufficientBalanceException(String msg)
	{
		super(msg);
	}
}


class BankApp
{

	static void withdraw(double balance, double amount) throws InsufficientBalanceException
	{
		if(amount > balance)
		{
			throw new InsufficientBalanceException("Insufficient Balance.");
		}

		balance = balance - amount;
		System.out.println("withdraw successful");
		System.out.println("Remaining balance: " +balance);
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Balance: ");
		double balance = sc.nextDouble();

		System.out.println("Enter withdraw Amount: ");
		double amount = sc.nextDouble();

		try
		{
			withdraw(balance, amount);
		}

		catch (InsufficientBalanceException e)
		{
			System.out.println(e.getMessage());
		}
	}
}
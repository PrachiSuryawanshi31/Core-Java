import java.util.Scanner;

class FinallyExample5
{
	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);
		
		try
		{
			System.out.println("Enter a number:");
			int num = Integer.parseInt(sc.nextLine());

			System.out.println("You entered: "+ num);
		}

		catch(NumberFormatException e)
		{
			System.out.println("Invalid number format.");
		}

		finally
		{
			System.out.println("Scanner closed in finally block.");
		}
	}
}
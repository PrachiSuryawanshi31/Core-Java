import java.util.Scanner;

class SimpleCalculationResult
{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		try
		{
			System.out.println("Enter First Number: ");
			int a = Integer.parseInt(sc.nextLine());

			System.out.println("Enter Second Number:");
			int b = Integer.parseInt(sc.nextLine());

			int result = a /b ;
			System.out.println("Division Result: " + result);
		
			int arr[] = {10, 20, 30, 40, 50};

			System.out.println("Enter index to access array: ");
			int index = Integer.parseInt(sc.nextLine());

			System.out.println("Array Value: " +arr[index]);

		}

		catch(ArithmeticException e)
		{
			System.out.println("Error : Cannot divide by zero.");
		}

		catch(NumberFormatException e)
		{
			System.out.println("Error : Please enter valid numeric values.");
		}

		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Error: Invalid array index .");
		}

		catch(Exception e)
		{
			System.out.println("Unexpected Error: " + e.getMessage());
		}

		finally
		{
			System.out.println("Program Ended.");
		}

	}
}
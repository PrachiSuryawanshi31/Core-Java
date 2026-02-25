class MultipleCatchExample1
{
	public static void main(String[] args) {
		
		try
		{
			int a = 10;

			// If b = 0 → ArithmeticException will occur (divide by zero)
			// int b = 0;

			// If b = 2 → No exception will occur
			int b = 2;

			// Division operation
			// If b = 0 → exception happens here
			// If b = 2 → result = 5 and program continues normally
			int result = a / b;
		}

		// This block runs only if ArithmeticException occurs
		catch(ArithmeticException e)
		{
			System.out.println("Cannot Divide By Zero..");
		}

		// This block runs if any other exception occurs
		// It acts as a general safety handler
		catch(Exception e)
		{
			System.out.println("Some other error occurred.");
		}

		// This line always executes
		// (whether exception happens or not, after catch handling)
		System.out.println("Program Continues...");
	}
}
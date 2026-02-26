class FinallyExample2
{
	public static void main(String[] args) {
		
		try
		{
			int x = 10;
			int y = 2;
			int result = x / y;
			System.out.println("Result: "+result);
		}

		catch(ArithmeticException e)
		{
			System.out.println("Error Occurred.");
		}

		finally 
		{
			System.out.println("Finally Block Executed.");	
		}

		// No exception occurs, so result is printed first.
		// Finally block executes after try block.
	}
}
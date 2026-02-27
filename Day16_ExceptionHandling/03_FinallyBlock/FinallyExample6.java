class FinallyExample3
{
	public static void main(String[] args) {
		
		System.out.println("Result: "+ testMethod());
	}

	static int testMethod()
	{
		try
		{
			int a = 10;
			int b = 2;

			int result = a / b;
			return result;
		}

		catch(Exception e)
		{
			System.out.println("Exception Occurred.");
			return -1;
		}

		finally
		{
			System.out.println("Finally Block executed.");
		}

	}
}
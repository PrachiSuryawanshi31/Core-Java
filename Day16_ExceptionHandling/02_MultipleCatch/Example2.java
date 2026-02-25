class Example2
{
	public static void main(String[] args) {
		
		try
		{
			int ino1 =100;
		   //int ino2 = 0;  //Occured ArithmaticException
			int ino2 = 50;

			int ans = ino1 / ino2;  // If ino2 = 50 → ans = 2 (No ArithmeticException)

			String str = null;
			System.out.println(str.length());  //NullPointerException
		}

		catch(ArithmeticException e)
		{
			System.out.println("Cannot Divide By Zero...");
		}

		// This is a general catch block.
// It handles any exception that is not caught by above specific catch blocks.
// Since Exception is the parent class of most exceptions,
// it acts as a backup handler for unexpected errors.
		catch (Exception e)
		{
			System.out.println("Some Other Error Occurred.");
		}

		System.out.println("Program Continues...");
	}
}
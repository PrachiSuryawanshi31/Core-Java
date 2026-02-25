class Example4
{
	public static void main(String[] args) {
		
		try
		{
			int ino1 = 50;
			int ino2 = 2;

			int result = ino1 / ino2; //ArithmaticException
			
			String str = null;
			System.out.println(str.length()); //NullPointerException (not reacher)

		}

		// Multiple exceptions handled in one catch block
		catch (ArithmeticException | NullPointerException e)
		{
			System.out.println("Arithmatic or null error occurred.");
		}

		catch (Exception e)
		{
			System.out.println("Some other error occurred.");
		}

		System.out.println("Continue...");
	}
}
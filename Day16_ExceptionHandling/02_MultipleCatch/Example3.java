class Example3
{
	public static void main(String[] args) {
		
		try
		{
			int a = 10;
			int b = 0;

			//This line gives ArithmaticException (because of divide ny 0)
			int result = a/b;

			//This code will never execute
			//because exception already occurred above
			int arr[] = new int[3];
			arr[5]=100;  //ArrayIndexOutOfBoundsException not reached.

		}

		//This catch block executes first
		catch (ArithmeticException e)
		{
			System.out.println("Cannot Divide By Zero...");
		}

		//This catch block will not execute
		//because control already moved after first exception
		catch (ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Invalid Array Index.");
		}

		//this catch (used if any other exception occurs to handle other exception )
		catch (Exception e)
		{
			System.out.println("Some Other Error Occurred.");
		}

		
		System.out.println("Continue..");

	}
}
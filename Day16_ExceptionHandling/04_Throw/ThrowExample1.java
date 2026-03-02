class ThrowExample1
{
	public static void main(String[] args) {
		
		int age = -5;  
		
		// Check if age is negative
		if(age < 0)
		{
			// Manually throwing an exception using 'throw' keyword
			// This will stop the program execution immediately
			throw new ArithmeticException("Age Cannot be Negative.");
		}

		System.out.println("Valid Age");
	}
}
class NumberFormatEx
{
	public static void main(String[] args) {
		
		/*int number1 = Integer.parseInt("Siya");
			System.out.println(number1);  //NumberFormatException
		*/

		try
		{
			int number = Integer.parseInt("Prachi");
			System.out.println(number);
		}

		catch (NumberFormatException e)
		{
			System.out.println("Error: Invalid number format.");
		}

			System.out.println("Program Continues...");
	}
}
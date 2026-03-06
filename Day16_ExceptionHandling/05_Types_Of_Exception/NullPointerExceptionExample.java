class NullPointerExceptionExample
{
	public static void main(String[] args) {
		
		
		/*
		String name =null;

		String result = name.toUpperCase();

		System.out.println(result); //it gives NullPointerException -->to resolve this we use try-catch block
		
		*/
		
		try
		{
			String name = null;

			String result = name.toUpperCase();

			System.out.println(result); //it gives exception
		}

		catch(NullPointerException e)
		{
			System.out.println("NullPointerException occurred: string is null");
		}
	}
}
class ArrayIndexOutOfBoundsExample
{
	public static void main(String[] args) {
		
		/*
		int arr[] = {10, 20, 30, 40,50};

		System.out.println(arr[6]); //It Gives Exception 
		*/

		/*to resolve this exception handling we use the try -catch block.*/

		try
		{
			int arr[] = {10, 20, 30, 40, 50};

			System.out.println(arr[6]);
		}

		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("ArrayIndexOutOfBoundsException occurred: Due to invalid array index.");
		}
	}
}
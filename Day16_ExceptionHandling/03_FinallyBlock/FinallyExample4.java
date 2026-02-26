class FinallyExample4
{
	public static void main(String[] args) {
		
		int[] arr = new int[3];
		
		try
		{
			System.out.println("Accessing array element...");
			System.out.println(arr[1]);  // it's Valid index, no exception
		}

		finally
		{
			// Mandatory code that must execute
			System.out.println("Finally Block Executed..");
		}
	}
}
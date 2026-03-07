class RemoveDuplicate
{
	public static void main(String[] args) {
		int arr[] = {1, 2, 3, 4, ,1,1,4,6,8,9};

		System.out.println("Array without duplicates: ");

		for( int i = 0; i < arr.length; i++)
		{
			boolean isDuplicate = false;

			for(int j = 0; j < i; j++)
			{
				if(arr[i] == arr[j])
				{
					isDuplicate = true;
					break;
				}
			}

			if(!isDuplicate)
			{
				System.out.println(arr[i] + " ");
			}
		}
	}
}

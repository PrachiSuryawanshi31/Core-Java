import java.util.Scanner;

class MinElement
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int i;
		System.out.println("Enter Array Elements");
		int size = sc.nextInt();

		int arr[] = new int[size];

		System.out.println("Enter Array Element:");
		for(i = 0 ; i < size; i++)
		{
			arr[i] = sc.nextInt();
		}

		int min = arr[0];

		for(i =1 ; i < size ; i++)
		{
			if(arr[i] < min)
			{
				min = arr[i];
			}
		}

		System.out.println("Minimum Element is: "+ min);

	}
}
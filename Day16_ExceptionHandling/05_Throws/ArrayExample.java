import java.util.Scanner;

class ArrayExample
{

	static int getValue(int arr[], int index) throws ArrayIndexOutOfBoundsException
	{
		return arr[index];
	}
		

	public static void main(String[] args) {

		Scanner sc =new Scanner(System.in);

		int arr[] = new int [3];
		System.out.println("Enter 3 Array Elements:");

		for(int i = 0; i < arr.length; i++)
		{
			arr[i] = sc.nextInt();
		}

		System.out.println("Enter index to get element:");
		int index = sc.nextInt();

		int value = getValue(arr, index);

		System.out.println("Element: " + value);
	}
}
import java.util.Scanner;

class SquareandCube
{
	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);

		System.out.println("Enter number: ");
		int number = sc.nextInt();

		int square = number * number;

		System.out.println("Square of " +number +" is: " +square);

		int cube = number * number * number;

		System.out.println("Cube of " +number +" is : " +cube);
	}
}
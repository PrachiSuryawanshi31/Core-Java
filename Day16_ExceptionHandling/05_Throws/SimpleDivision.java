import java.util.Scanner;

class SimpleDivision
{

	static int divide(int a, int b) throws ArithmeticException
	{
		return a / b;
	}

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);


		System.out.println("Give first value:");
		int ino1 = sc.nextInt();

		System.out.println("Give second value:");
		int ino2 = sc.nextInt();

		int result = divide(ino1, ino2);  // If second number is 0 → ArithmeticException occurs

		System.out.println("Result: " + result);
	}
}
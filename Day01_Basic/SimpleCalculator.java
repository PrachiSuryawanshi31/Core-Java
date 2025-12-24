import java.util.Scanner;

class SimpleCalculator
{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Welcome to Simple Calculator!");

		System.out.println("Enter First Number:");
		double ino1 = sc.nextDouble();

		System.out.println("Enter Second Number:");
		double ino2 = sc.nextDouble();

		System.out.println("choose an Operation:");
		System.out.println("1. Addition (+)");
		System.out.println("2. Substraction (-)");
		System.out.println("3. Multiplication (*)");
		System.out.println("4. Division (/)");
		System.out.println("Enter your Choice between 1 to 4");
		int choice = sc.nextInt();

		double result;

		switch(choice)
		{
		case 1:
			result = ino1 + ino2;
			System.out.println("Result:" +result);
			break;

		case 2:
			result = ino1 - ino2;
			System.out.println("Result:" +result);
			break;

		case 3:
			result = ino1 * ino2;
			System.out.println("Result:" +result);
			break;

		case 4:
			if(ino2 != 0)
			{
			result = ino1 / ino2;
			System.out.println("Result:" +result);
			}
			else
			{
				System.out.println("it zero");
			}
			break;

		default:
			System.out.println("Invalid Choice!");
		}
	}
}
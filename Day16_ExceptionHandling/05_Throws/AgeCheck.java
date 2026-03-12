import java.util.Scanner;

class AgeCheck
{
	static void checkAge(int age) throws ArithmeticException
	{
		// If the age is less than 18, the method will throw an Arithmaticexception.
		if(age < 18)
		{
			throw new ArithmeticException("Age is less than 18");
		}

		System.out.println("Eligible");
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter age:");
		int age = sc.nextInt();

		checkAge(age);		


	}
}

import java.util.Scanner;

class PasswordStrengthChecker
{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Password:");
		String password = sc.nextLine();

		if(password.length() >= 8 && 
		   password.matches(".*[A-Z].*") &&
		   password.matches(".*[0-9].*"))
		{
			System.out.println("Strong Password");
		}
		else
		{
			System.out.println("Weak Password");
		}
	}
}

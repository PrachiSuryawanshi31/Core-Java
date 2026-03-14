import java.util.Scanner;

class PasswordChecker_Strings
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a new Password: ");
		String pass = sc.next();

		if(pass.length() >= 8 && pass.contains("@"))
		{
			System.out.println("Strong Password!");
		}

		else
		{
			System.out.println("Weak Password! \n Use min 8 chars and '@' :");
		}
		
	}
}
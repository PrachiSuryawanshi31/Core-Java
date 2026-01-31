import java.util.Scanner;

// Interface 
interface Validator
{
    boolean validate(String input);
}

// Email validation 
class EmailValidator implements Validator
{
    public boolean validate(String input)
    {
        return input.contains("@") && input.contains(".");
    }
}

// Password validation 
class PasswordValidator implements Validator
{
    public boolean validate(String input)
    {
        return input.length() >= 8;
    }
}

// Age validation 
class AgeValidator implements Validator
{
    public boolean validate(String input)
    {
        int age = Integer.parseInt(input);
        return age >= 18;
    }
}


// Main Class
public class ValidationSystem
{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        Validator validator = null;

        System.out.println("Choose Validation Type:");
        System.out.println("1. Email Validation");
        System.out.println("2. Password Validation");
        System.out.println("3. Age Validation");
        
        System.out.print("Enter choice: ");
        int choice = sc.nextInt();

        sc.nextLine(); 

        System.out.print("Enter input to validate: ");
        String input = sc.nextLine();

       
        if (choice == 1)
        {
            validator = new EmailValidator();
        }

        else if (choice == 2)
        {
            validator = new PasswordValidator();
        }

        else if (choice == 3)
        {
            validator = new AgeValidator();
        }
        
        else
        {
            System.out.println("Invalid choice!");
            
        }

        if (validator.validate(input))
        {
        	System.out.println("Validation Successful...!");
        }

        else
        {    
        	System.out.println("Validation Failed ..!");
		}
	}
}
import java.util.Scanner;

// Interface defining authentication rules
interface AuthService
{
    boolean authenticate(String username, String password);

    default void showAuthMessage()
    {
        System.out.println("Authentication process started...");
    }

    static void authInfo()
    {
        System.out.println("AuthService v1.0 - Secure Login System");
    }
}

// Username & Password based authentication
class PasswordAuth implements AuthService
{
    public boolean authenticate(String username, String password)
    {
        return username.equals("admin") && password.equals("admin123");
    }
}

// OTP based authentication
class OTPAuth implements AuthService
{
    public boolean authenticate(String username, String password)
    {
        return password.equals("123456");
    }
}

// Main class with user choice
public class AuthSystem
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        AuthService auth = null;

        AuthService.authInfo();

        System.out.println("\nChoose Authentication Method:");
        System.out.println("1. Username & Password");
        System.out.println("2. OTP Authentication");

        System.out.print("Enter choice: ");
        int choice = sc.nextInt();

        sc.nextLine(); 

        System.out.print("Enter username: ");
        String username = sc.nextLine();

        System.out.print("Enter password / OTP: ");
        String password = sc.nextLine();


        if (choice == 1)
        {
            auth = new PasswordAuth();
        }
        else if (choice == 2)
        {
            auth = new OTPAuth();
        }
        else
        {
            System.out.println("Invalid choice!");
           
        }

        auth.showAuthMessage();

        if (auth.authenticate(username, password))
        {
            System.out.println("Authentication Successful!");
        }
        else
        {
            System.out.println("Authentication Failed!");
        }

    }
}

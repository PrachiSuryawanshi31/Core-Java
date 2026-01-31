import java.util.Scanner;

// Interface for notification
interface NotificationService
{
    void sendNotification(String message);
}

// Email notification
class EmailNotification implements NotificationService
{
    public void sendNotification(String message)
    {
        System.out.println("Email Sent: " + message);
    }
}

// SMS notification
class SMSNotification implements NotificationService
{
    public void sendNotification(String message)
    {
        System.out.println("SMS Sent: " + message);
    }
}

// WhatsApp notification
class WhatsAppNotification implements NotificationService
{
    public void sendNotification(String message)
    {
        System.out.println("WhatsApp Message Sent: " + message);
    }
}

// Main class with user input
public class NotificationSystem
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        NotificationService service = null;

        System.out.println("Choose Notification Type:");
        System.out.println("1. Email");
        System.out.println("2. SMS");
        System.out.println("3. WhatsApp");
        System.out.print("Enter choice: ");
        int choice = sc.nextInt();
        sc.nextLine(); // clear buffer

        System.out.print("Enter message: ");
        String message = sc.nextLine();

        // Runtime selection
        if (choice == 1)
        {
            service = new EmailNotification();
        }
        
        else if (choice == 2)
        {
            service = new SMSNotification();
        }

        else if (choice == 3)
        {
            service = new WhatsAppNotification();
        }

        else
        {
            System.out.println("Invalid Choice!");
      
        }

        service.sendNotification(message);
    }
}

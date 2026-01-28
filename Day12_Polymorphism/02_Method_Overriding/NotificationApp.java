import java.util.Scanner;

// Parent class
class Notification {
    void send(String message) {
        System.out.println("Sending generic notification: " + message);
    }
}

// Child class 1
class EmailNotification extends Notification {
    @Override
    void send(String message) {
        System.out.println("Sending Email Notification");
        System.out.println("Email Content: " + message);
    }
}

// Child class 2
class SMSNotification extends Notification {
    @Override
    void send(String message) {
        System.out.println("Sending SMS Notification");
        System.out.println("SMS Content: " + message);
    }
}

// Main class
public class NotificationApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Message:");
        String msg = sc.nextLine();

        System.out.println("Choose Notification Type:");
        System.out.println("1. Email");
        System.out.println("2. SMS");

        int choice = sc.nextInt();

        Notification n; // parent reference

        if (choice == 1) 
        {
            n = new EmailNotification();
        }
        
        else
        {
            n = new SMSNotification();
        }

        System.out.println("\n--- Notification Status ---");
        n.send(msg);   // overridden method called
    }
}

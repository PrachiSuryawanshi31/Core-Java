import java.util.Scanner;

// Interface 1
interface EligibilityCheck {
    boolean checkEligibility(int year);
}

// Interface 2
interface FeeVerification {
    boolean verifyFee(boolean feePaid);
}

// Interface 3
interface RoomAllocation {
    String allocateRoom(String gender, int year);
}

// Interface 4
interface Notification {
    void notifyStudent(String message);
}

// Implementing multiple inheritance
class HostelSystem implements EligibilityCheck, FeeVerification, RoomAllocation, Notification {

    int boysRooms = 2;
    int girlsRooms = 2;

    public boolean checkEligibility(int year) {
        return year >= 1 && year <= 4;
    }

    public boolean verifyFee(boolean feePaid) {
        return feePaid;
    }

    public String allocateRoom(String gender, int year) {

        if (gender.equalsIgnoreCase("female") && girlsRooms > 0) {
            
            girlsRooms--;

            return (year == 4) ? "G-Block Priority Room" : "G-Block Standard Room";
        }

        if (gender.equalsIgnoreCase("male") && boysRooms > 0) {
            boysRooms--;

            return (year == 4) ? "B-Block Priority Room" : "B-Block Standard Room";
        }

        return "No Rooms Available";
    }

    public void notifyStudent(String message) {
       
        System.out.println(message);
    }
}

public class Hostel {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        HostelSystem hostel = new HostelSystem();

        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Gender (Male/Female): ");
        String gender = sc.nextLine();

        System.out.print("Enter Year (1-4): ");
        int year = sc.nextInt();

        System.out.print("Fee Paid? (true/false): ");
        boolean feePaid = sc.nextBoolean();


        if (!hostel.checkEligibility(year)) 
        {    
            hostel.notifyStudent("Invalid Academic Year!");
            return;
        }

        if (!hostel.verifyFee(feePaid)) 
        {
            hostel.notifyStudent("Room Allocation Failed: Fee not paid.");
            return;
        }

        String room = hostel.allocateRoom(gender, year);

        if (room.equals("No Rooms Available"))
        {
            hostel.notifyStudent("Sorry " + name + ", hostel is full.");
        } 
        else
        {
            hostel.notifyStudent("\nRoom Allocated Successfully ✔");
            
            System.out.println("Student Name : " + name);
            System.out.println("Allocated Room : " + room);
        }
    }
}

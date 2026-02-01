import java.util.Scanner;

interface Appointment 
{
    void bookAppointment(String doctor);
}

interface BillingService 
{
    double generateBill();
}

interface NotificationService {
    void notifyPatient();
}

class HospitalSystem implements Appointment, BillingService, NotificationService {

   
    public void bookAppointment(String doctor) 
    {
        System.out.println("Appointment booked with Dr. " + doctor);
    }

  
    public double generateBill()
    {
        return 700;
    }

    public void notifyPatient() 
    {
        System.out.println("Patient notified successfully");
    }
}

public class Hospital {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        HospitalSystem hospital = new HospitalSystem();

        System.out.print("Enter doctor name: ");
        String doctor = sc.nextLine();

        hospital.bookAppointment(doctor);

        System.out.println("Bill Amount: " + hospital.generateBill());
        hospital.notifyPatient();

    }
}

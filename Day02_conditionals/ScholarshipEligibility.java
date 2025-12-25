import java.util.Scanner;

class ScholarshipEligibility
{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Makrs:");
		int marks = sc.nextInt();

		System.out.println("Enter family income:");
		double income = sc.nextDouble();

		if(marks>=75 && income <=200000)
		{
			System.out.println("Eligible for Scholarship");
		}

		else
		{
			System.out.println("Not Eligible for Scholarship");
		}
	}
}
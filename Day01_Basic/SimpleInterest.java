import java.util.Scanner;

class SimpleInterest
{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Principle:");
		int principle = sc.nextInt();

		System.out.println("Enter rate:");
		int rate = sc.nextInt();

		System.out.println("Enter time Period:");
		int time = sc.nextInt();

		int sip = (principle * rate * time) / 100;

		System.out.println("Simple Interest:"+sip);
	}
}
//Create Java program to calculate electricity bill using if-else


import java.util.Scanner;

class ElectricityBillCalculator 
{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		double bill;
		System.out.println("Enter Units Consumed:");
		int units = sc.nextInt();

		if(units <= 100)
		{
			bill = units * 1.5;
		}
		else if (units <=200)
		{
			bill = (units * 1.5)+((units-100)*2.5);
		}
		else
		{
			bill = (100*1.5)+(100*250)+((units-200)*4.0);
		}

		System.out.println("Total Electricity Bill : RS"+bill);
	}
}
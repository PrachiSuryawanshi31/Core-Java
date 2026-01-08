import java.util.Scanner;

class AverageCalculator
{
	static double calculateAverage(int total, int count)
	{
		return (double) total / count ;
	}

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);

		System.out.println("How Many Numbers: ");

		int n =sc.nextInt();
		int sum =0 ;

		System.out.println("Enter Numbers :");
		for(int i = 1; i <= n; i++)
		{
			int num = sc.nextInt();
			sum = sum + num;
		}

		double avg = calculateAverage(sum , n);

		System.out.println("Average = "+ avg);
	}
}
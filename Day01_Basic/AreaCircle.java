import java.util.Scanner;

class AreaCircle
{
	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);

		System.out.println("Enter Radius:");
		double radius= sc.nextDouble();

		double area = 3.14 * radius * radius;

		System.out.println("Area of Circle: " +area);
	}
}
import java.util.Scanner;

class Areas
{
	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);

		System.out.println("***Area Of Reactangle***");

		System.out.println("Enter Length:");
		int length = sc.nextInt();

		System.out.println("Enter Width: ");
		int width = sc.nextInt();

		int AreaOfRectangle = length * width;

		System.out.println("Area of Reactangle:"+AreaOfRectangle);
		

		System.out.println("***Area Of Square:***");

		System.out.println("Enter side:");
		int side = sc.nextInt();

		int AreaOfSquare = side * side;

		System.out.println("Area Of Square : "+AreaOfSquare);

		System.out.println("***Area Of Triangle***");

		System.out.println("Enter base:");
		int base = sc.nextInt();

		System.out.println("Enter height:");
		int height = sc.nextInt();

		double AreaOfTriangle = (base * height)/2;

		System.out.println("Area Of Triangle: " +AreaOfTriangle);


	}
}
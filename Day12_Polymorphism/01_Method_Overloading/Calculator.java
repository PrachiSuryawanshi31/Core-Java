import java.util.Scanner;

class Calculator
{	
	int calculate(int a, int b) {
        return a + b;
    }

    int calculate(int a, int b, int c) {
        return a + b + c;
    }

    double calculate(double a, double b) {
        return a * b;
    }

    double calculate(double a, double b, double c) {
        return (a + b + c) / 3;
    }

    // Overloaded method for square & cube
    int calculate(int num) {
        return num * num;
    }

    int calculate(int num, boolean cube) {
        return num * num * num;
    }

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Calculator cal = new Calculator();

		System.out.println("1. Add 2 Number");
		 System.out.println("2. Add 3 numbers");
        System.out.println("3. Multiply 2 decimals");
        System.out.println("4. Average of 3 decimals");
        System.out.println("5. Square of a number");
        System.out.println("6. Cube of a number");

        System.out.print("Enter your choice: ");
		
		int choice = sc.nextInt();

		switch(choice){

		case 1:
			System.out.println("Enter two integers: ");
			System.out.println("Result: "+cal.calculate(sc.nextInt(), sc.nextInt()));
			break;	

		case 2:
			System.out.println("Enter Three integers:");
			System.out.println("Result: "+cal.calculate(sc.nextInt(), sc.nextInt(), sc.nextInt()));
			break;

		case 3:
			System.out.println("Enter Two Decimal Numbers: ");
			System.out.println("Result: "+cal.calculate(sc.nextInt(), sc.nextInt()));
			break;

		case 4:
            System.out.print("Enter three decimal numbers: ");
            System.out.println("Average: " +cal.calculate(sc.nextDouble(), sc.nextDouble(), sc.nextDouble()));
            break;

        case 5:
            System.out.print("Enter number: ");
            System.out.println("Square: " +
                        cal.calculate(sc.nextInt()));
            break;

        case 6:
            System.out.print("Enter number: ");
            System.out.println("Cube: " +
                        cal.calculate(sc.nextInt(), true));
            break;

        default:
                System.out.println("Invalid Choice");


		}
	}

}
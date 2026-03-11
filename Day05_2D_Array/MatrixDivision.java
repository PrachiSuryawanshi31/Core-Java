import java.util.Scanner;

class MatrixDivision
{
	public static void main(String[] args) {
			
			Scanner sc =new Scanner(System.in);

			int a[][] = new int[2][2];
			int b[][] = new int[2][2];

			int div[][] = new int[2][2];

			System.out.println("Enter First Matrix: ");

			for(int i = 0; i < 2; i++)
			{
				for( int j = 0; j < 2; j++)
				{
					a[i][j] = sc.nextInt();
				}
			}

			System.out.println("Enter Second Matrix: ");
			for(int i = 0; i < 2; i++)
			{
				for( int j = 0; j < 2; j++)
				{
					b[i][j] = sc.nextInt();
				}
			}

			for(int  i = 0; i < 2; i++)
			{
				for(int j = 0; j < 2; j++)
				{
					div[i][j] = a[i][j] / b[i][j];
				}
			}
			

			System.out.println("Matrix Devision Result : \t");

			for(int i= 0; i < 2; i++)
			{
				for(int j = 0; j < 2; j++)
				{
					System.out.print("\t" + div[i][j] + " \t");
				}
				System.out.println();
			}
		}	


}
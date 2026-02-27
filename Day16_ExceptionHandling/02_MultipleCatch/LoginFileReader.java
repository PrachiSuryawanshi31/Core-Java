import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class LoginFileReader
{
	public static void main(String[] args) {

		Scanner sc =new Scanner(System.in);
	
		try
		{
			System.out.println("Enter Your user Id.");
			int userId = Integer.parseInt(sc.nextLine());

			System.out.println("Enter file name to read:");
			String fileName = sc.nextLine();

			File file = new File(fileName);
			Scanner fileScanner = new Scanner(file);

			System.out.println("File Content");

			while(fileScanner.hasNextLine())
			{
				System.out.println(fileScanner.nextLine());
			}
		}

		catch(NumberFormatException e)
		{
			System.out.println("Error: User Id must be a number.");
		}

		catch(FileNotFoundException e)
		{
			System.out.println("Error : file not found.");
		}

		catch(NullPointerException e)
		{
			System.out.println("Error : Null Value encountered");
		}

		catch(Exception e)
		{
			System.out.println("Unexpected Error: "+e.getMessage());
		}

		finally
		{
			System.out.println("Login Process Completed.");
		}

	}
}
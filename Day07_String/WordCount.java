
import java.util.Scanner;

class WordCount
{
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);

		System.out.println("Enter A Sentance:");
		String str = sc.nextLine();

		int count = 1;// Start counting from 1 because at least one word is present

		for(int i = 0; i < str.length(); i++)
		{
			// Every space means a new word
			if(str.charAt(i) ==' ')
			{
				count ++;
			}
		} 

		System.out.println("Total Word :"+count);
	}
}
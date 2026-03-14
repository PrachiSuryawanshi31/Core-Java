class ReverseString
{
	public static void main(String[] args) {
		String input =" I Love Java.";

		String[] words = input.split(" ");
		String output = " ";

		for(int i = words.length- 1 ; i >= 0; i--)
		{
			output = output + words[i] + " ";
		}

		System.out.println("Original :" + input);
		System.out.println("Reversed Words: " + output.trim());
	}
}
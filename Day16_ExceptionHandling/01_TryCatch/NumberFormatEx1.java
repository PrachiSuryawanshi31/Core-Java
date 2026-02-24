class NumberFormatEx1
{
	public static void main(String[] args) {
		
		String data[] = {"50", "30", "ten", "20", "5a"};

		int sum = 0;

		for(int i =0; i < data.length; i++)
		{
			try
			{				//parseInt() is used to convert String → int
				int num = Integer.parseInt(data[i]);

				sum = sum + num;
			}

			catch (NumberFormatException e)
			{
				System.out.println("Invalid number found: " + data[i]);
			}
		}

		System.out.println("Total Sum =" + sum);

	}
}
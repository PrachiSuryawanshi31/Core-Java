class DataTypes
{
	public static void main(String[] args) {
		
		
		short s1 =20;		// short: 2-byte integer used to store small whole numbers
		byte b1 = 25;		// byte: 1-byte integer used to save memory (range -128 to 127)
		int number = 50000; // int: 4-byte integer used for storing whole numbers
		long ino = 98967426;// long: 8-byte integer used for very large whole numbers

		char ch1 = 'P';		 // char:1-byte stores a single character enclosed in single quotes
		String name = "Prachi";// String: stores a sequence of characters text
		boolean b = true;		// boolean: stores only true or false values

		float floatValue = 20; // float:4-byte stores decimal values with single precision
		double doubleValue = 50; // double:8-byte stores decimal values with higher precision

		System.out.println("Short Value :" +s1);
		System.out.println("Byte Value :"+b1);
		System.out.println("Integer Value:" +number);

		System.out.println("Charecter Value :"+ch1);
		System.out.println("String Value:" +name);
		System.out.println("Boolean Value:"+b);

		System.out.println("Float Value:" +floatValue);
		System.out.println("Double Value :"+doubleValue);

	}
}
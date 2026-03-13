class Device
{
	String brand = " Universal Tech";

	void powerOn()
	{
		System.out.println("Device is starting up...");
	}
}

class Smartphone extends Device
{
	String model = "Galaxy S23";

	void showDetails()
	{
		System.out.println("Brand: " +brand);
		System.out.println("Model: " +model);
	}
}

class TechStore
{
	public static void main(String[] args) {
		

		Smartphone myPhone = new Smartphone();
		myPhone.powerOn();
		myPhone.showDetails();
	}
}

abstract class RemoteControl
{
	abstract void startEngine();

	void checkBattery()
	{
		System.out.println("Remote Battery: 90%");
	}
}


class MyCarRemote extends RemoteControl
{
	void startEngine()
	{
		System.out.println("Car Engine started wirelessly.");
	}
}

class CarSystem
{
	public static void main(String[] args) {
		
		RemoteControl remoteControl = new MyCarRemote();

		remoteControl.checkBattery();
		remoteControl.startEngine();
	}
}
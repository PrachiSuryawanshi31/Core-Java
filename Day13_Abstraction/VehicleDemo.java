
import java.util.Scanner;

abstract class Vehicle 
{

	abstract void start(); //abstract method -->without body
	abstract void stop();
}

class Car extends Vehicle{

	@Override
	void start(){
		System.out.println("Car started with key ignition.");
	}

	@Override
	void stop(){
		System.out.println("Car stopped using bake.");
	}
}

class Bike extends Vehicle
{	
	@Override
	void start(){
		System.out.println("Bike stopped using brake");
	}

	@Override
	void stop(){
		System.out.println("Bike stopped using brake.");
	}
}

class VehicleDemo
{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);


		System.out.println("Choose Vehicle: \n 1.Car \n 2.Bike");
		int choice = sc.nextInt();

		Vehicle v ;

		if(choice == 1)
		{
			v = new Car(); // car class call
		}

		else
		{
			v = new Bike(); //bike class call
		}

		v.start();  //Start() method is called 
		v.stop();	//stop() method is called
	}
}
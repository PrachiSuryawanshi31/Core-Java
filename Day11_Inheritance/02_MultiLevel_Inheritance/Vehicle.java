// Created advanced SportsCar program demonstrating multilevel inheritance and Scanner usage

import java.util.Scanner;

class VehicleBrand
{
    String brand;

    void setBrand(String brand)
    {
        this.brand = brand;
    }
}

class Car extends VehicleBrand
{
    int speed;

    void setSpeed(int speed)
    {
        if(speed > 0)
        {
            this.speed = speed;
        }
        else
        {
            System.out.println("Invalid Speed.");
        }
    }
}

class Vehicle extends Car
{
    double acceleration;   // 0–100 km/h time

    void setAcceleration(double acc)
    {
        if(acc > 0)
        {
            acceleration = acc;
        }
        else
        {
            System.out.println("Invalid acceleration value");
        }
    }

    void showPerformance()
    {
        if(speed >= 200)
            System.out.println("Performance: High Performance Vehicle");
        else
            System.out.println("Performance: Normal Sports Car");
    }

    void display()
    {
        System.out.println("Brand: " + brand);
        System.out.println("Top Speed: " + speed + " km/h");
        System.out.println("0 – 100 km/h in: " + acceleration + " seconds");
        showPerformance();
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Vehicle vehicle = new Vehicle();

        System.out.println("Enter Car Brand:");
        vehicle.setBrand(sc.nextLine());

        System.out.println("Enter Top Speed:");
        vehicle.setSpeed(sc.nextInt());

        System.out.println("Enter 0 – 100 Acceleration Time:");
        vehicle.setAcceleration(sc.nextDouble());

        System.out.println("\n----- Sports Car Details -----");
        vehicle.display();
    }
}

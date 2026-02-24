/*Q3. Problem:
Create a POJO class Car with fields: carId, model, fuelConsumed, and distanceTravelled. Store details of 5 cars using an array of objects. Perform the following operations:
Calculate the mileage of each car (mileage = distanceTravelled / fuelConsumed).
Find the car with the best mileage.
Display cars whose mileage is above the average mileage of all cars.*/

package Car_Mileage;

import java.util.*;
public class Car_Mileage_Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("How many car records do you want to enter? ");
		int size = sc.nextInt();
		
		Car c[] = new Car[size];
		
		int Id = 0, FuelConsumed = 0, DistTravel = 0;
		String Model = " ";
		
		for(int i = 0; i < c.length; i++)
		{
			c[i] = new Car();
			
			System.out.println("Enter the Car Model: ");
			Model = sc.next();
			
			System.out.println("Enter the Fuel Consumed by Car: ");
			FuelConsumed = sc.nextInt();
			
			System.out.println("Enter the Distance Travelled by Car: ");
			DistTravel = sc.nextInt();
			
			c[i].setModel(Model);
			c[i].setFuel(FuelConsumed);
			c[i].setDist_Travel(DistTravel);
		}
		
		System.out.printf("%-6s %-15s %-25s %-25s %-10s\n", "Id", "Model", "Fuel Consumed (liters)", "Distance Travelled (km)", "Mileage");
		System.out.println("------------------------------------------------------------------------------");
		
		double totalMileage = 0.0;
		double bestMileage= 0.0;
		String bestCar = " ";
		
		for(int i = 0; i < c.length; i++)
		{
			double Mileage = c[i].getDist_Travel() / c[i].getFuel();
			totalMileage = totalMileage + Mileage;
			
			if(bestMileage < Mileage)
			{
				bestMileage = Mileage;
				bestCar = c[i].getModel();
			}
			System.out.printf("%-5d %-15s %-20d %-35d %-8.2f\n",
                    c[i].getCarId(), c[i].getModel(), c[i].getFuel(), c[i].getDist_Travel(), Mileage);
		}
		double averageMileage = totalMileage / size;
		
		System.out.println("Best Mileage Car: " + bestCar + " is: " + bestMileage);
		System.out.println("Average Mileage of all Cars: %.2f km/l: " + averageMileage);
		
		System.out.println("\nCars with above average mileage:");
		for(int i = 0; i < c.length; i++)
		{
			double mileage = (double)c[i].getDist_Travel() / c[i].getFuel();
			if(mileage > averageMileage)
			{
				System.out.printf("%-5d %-15s %-10.2f km/l\n", c[i].getCarId(), c[i].getModel(), mileage);
			}
		}
	}
}

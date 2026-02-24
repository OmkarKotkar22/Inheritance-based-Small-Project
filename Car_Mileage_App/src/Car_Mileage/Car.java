package Car_Mileage;

public class Car {
	private static int counter  = 0;
	private int id;
	private String model;
	private int fuel;
	private int dist_travel;
	
	public Car()
	{
		counter++;
		id = counter;
	}
	public int getCarId()
	{
		return id;
	}
	
	public void setModel(String m)
	{
		model = m;
	}
	public String getModel()
	{
		return model;
	}
	
	public void setFuel(int f)
	{
		fuel = f;
	}
	public int getFuel()
	{
		return fuel;
	}
	
	public void setDist_Travel(int d)
	{
		dist_travel = d;
	}
	public int getDist_Travel()
	{
		return dist_travel;
	}
}

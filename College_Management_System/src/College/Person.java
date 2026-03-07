package College;

import java.util.*;

public class Person {
	
	Scanner sc = new Scanner(System.in);
	int id;
	String name;
	String address;
	long contactNo;
	
	public Person(int id, String name, String address, long contactNo)
	{
		this.id = id;
		this.name = name;
		this.address = address;
		this.contactNo = contactNo;
	}
	
	void displayDetails()
	{
		System.out.println("Display Details");
	}
	
	void updateAddress()
	{
		System.out.println("Update Address");
		address = sc.nextLine();
	}
	
	void updateContact()
	{
		System.out.println("Update Contact");
		contactNo = sc.nextLong();
	}
	
	void showBasicInfo()
	{
		System.out.println("Id: "+ id);
		System.out.println("Name: "+ name);
		System.out.println("Address: "+ address);
		System.out.println("Contact: "+ contactNo);
	}
}

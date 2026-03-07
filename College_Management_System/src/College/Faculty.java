package College;

import java.util.*;

public class Faculty extends Person {

	Scanner sc = new Scanner(System.in);
	
	String subject;
	double salary;
	double experience;
	
	Faculty(int id, String name, String address, long contactNo, double salary, double experience)
	{
		super(id, name, address, contactNo);
		this.salary = salary;
		this.experience = experience;
	}
	
	void assignSubject()
	{
		System.out.println("Enter the Subject Name: ");
		subject = sc.next();
		sc.nextLine();
	}
	
	void updateAddress() 
	{
		System.out.println("Enter the Address: ");
		address = sc.next();
		sc.nextLine();
	}
	
	void calculateIncrement()
	{
		System.out.println("Enter the Increment: ");
		double inc = salary * 10 / 100;
		System.out.print(inc);
		salary = inc + salary;
	}
	
	void displayDetails()
	{
		System.out.println("============Faculty Info============");
		System.out.println("Faculty Id: "+ id);
		System.out.println("Faculty Name: "+ name);
		System.out.println("Faculty Address: "+ address);
		System.out.println("Faculty Contact Number: "+ contactNo);
		System.out.println("Faculty Subject: "+ subject);
		System.out.println("Faculty Salary: "+ salary);
		System.out.println("Faculty Expeience: "+ experience);
	}
}

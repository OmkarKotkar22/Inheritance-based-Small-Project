package College;

import java.util.*;

public class Student extends Person {
	
	Scanner sc = new Scanner(System.in);
	
	private String courseName;
	private int marks[] = new int[3];
	private double percentage;
	
	Student(int id, String name, String address, long contactNo, String courseName)
	{
		super(id, name, address, contactNo);
		this.courseName = courseName;
	}
	
	void enterMarks()
	{
		System.out.println("Enter the Elements in Array: ");
		for(int i = 0; i < marks.length; i++)
		{
			marks[i] = sc.nextInt();
		}
		sc.nextLine();
	}
	
	void calculatePercentage() 
	{
		int sum = 0;
		for(int i = 0; i < marks.length; i++)
		{
			sum = sum + marks[i];
		}
		percentage = sum / (double)marks.length;
	}
	
	void displayDetails()
	{
		System.out.println("===========Student Info=============");
		System.out.println("Student Id: "+ id);
		System.out.println("Student Name: "+ name);
		System.out.println("Student Address: "+ address);
		System.out.println("Student Contact Number: "+ contactNo);
		System.out.println("Student Course Name: "+ courseName);
		System.out.println("Marks of Student: ");
		for(int i = 0; i < marks.length; i++)
		{
			System.out.print(marks[i]+ " \t");
		}
		System.out.println("\n Student Percentage: "+ percentage);
	}
}

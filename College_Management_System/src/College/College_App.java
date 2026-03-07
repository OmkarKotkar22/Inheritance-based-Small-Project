package College;

import java.util.*;

public class College_App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
//		Person p = new Person();
		System.out.println("=======Enter the Student Details:=======");
		System.out.println("Enter the Id: ");
		int id = sc.nextInt();
		
		System.out.println("Ente the Name: ");
		String name = sc.next();
		sc.nextLine();
		
		System.out.println("Ente the Address: ");
		String address = sc.next();
		sc.nextLine();
		
		System.out.println("Enter the Contact Number: ");
		long contactNo = sc.nextLong();
		
		System.out.println("Enter the Course Name: ");
		String courseName = sc.next();
		sc.nextLine();
		
		Student s = new Student(id, name, address, contactNo, courseName);
//		s.addDetails(id, name, address, contactNo);
		s.enterMarks();
		s.calculatePercentage();
		s.updateContact();
		s.displayDetails();
		
		System.out.println("=======Enter the Teacher Details:=======");
		System.out.println("Enter the Teacher Salary: ");
		double salary = sc.nextDouble();
		
		System.out.println("Enter the Experience of Teacher: ");
		double exp = sc.nextDouble();
		
		Faculty f = new Faculty(id, name, address, contactNo, salary, exp);
		f.assignSubject();
		f.updateAddress();
		f.calculateIncrement();
		f.displayDetails();
	}

}

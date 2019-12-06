package test1;

import java.util.Scanner;

class Details {
	String id, sName,mId;
	Long phNo;
	public  void getDetails()
	{
		System.out.println("=======Details of the course===========");
		System.out.println("ID: "+id);
		System.out.println("Subject name: "+sName);
		System.out.println("Mail Id: "+mId);
		System.out.println("Phone number: "+phNo);
	}
}

public class Course {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Details d= new Details();
		System.out.println("Enter your id: ");
		d.id=s.nextLine();
		System.out.println("Enter your Subject name: ");
		d.sName=s.nextLine();
		System.out.println("Enter your mail id: ");
		d.mId=s.nextLine();
		System.out.println("Enter your phone number: ");
		d.phNo=s.nextLong();
		d.getDetails();
		s.close();
		

	}

}

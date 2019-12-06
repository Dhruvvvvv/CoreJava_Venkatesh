package ExceptionHandling;

import java.util.Scanner;

class CheckBranch extends Exception{
	public CheckBranch() {}
	public CheckBranch(String msg) {
		super(msg);
	}
    public void verify(String branch) throws CheckBranch {
    	try {
    	switch (branch) {
    	case "CSE":
    		System.out.println("Welcome to Programing field..!");
    		break;
    	
    	case "ECE":
    		System.out.println("Welcome to communication filed..!");
    		break;
    	default:
    		CheckBranch b= new CheckBranch("Enter valid branch..!");
    		throw b;
    }
    	}catch(CheckBranch ob) {
    		System.out.println("Details:"+ob.getMessage());
    		throw ob;
    	}
}
}

public class Check_userDefinedCheckedException extends Exception {

	public static void main(String[] args) {

		try {
			Scanner s= new Scanner(System.in);
			System.out.println("Enter your branch name::");
			String br= s.nextLine();
			CheckBranch cb= new CheckBranch();
			cb.verify(br);
			System.out.println("Enter your roll no:");
			int roll= Integer.parseInt(s.nextLine());
			System.out.println("====Your Details====");
			System.out.println("Your branch::"+br);
			System.out.println("Your rollno::"+roll);
			
		}catch(CheckBranch ob) {
			System.out.println("Details:"+ob.getMessage());
		}
	}

}

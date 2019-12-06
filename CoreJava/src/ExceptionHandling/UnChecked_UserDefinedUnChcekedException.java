package ExceptionHandling;

import java.util.Scanner;

public class UnChecked_UserDefinedUnChcekedException extends Throwable{

	public static void main(String[] args) {
		System.out.println("Enter Pin:");
		try {
		Scanner s= new Scanner(System.in);
		String str=s.nextLine();			
		if(str.length()!=4) {
			UnChecked_UserDefinedUnChcekedException ob= new UnChecked_UserDefinedUnChcekedException();
			throw ob;
		}System.out.println("Valid Pin:"+str);
		}catch(UnChecked_UserDefinedUnChcekedException e) {
			System.out.println("Details :"+e.getMessage());
			System.out.println("Invalid Pin");
		}
	}

}

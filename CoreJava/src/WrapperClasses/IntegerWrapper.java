package WrapperClasses;

import java.util.Scanner;

public class IntegerWrapper {

	public static void main(String[] args) {
		try {
			
		Scanner s= new Scanner(System.in);
		System.out.println("Integer Wrapper class has two constructor\n 1. Integer(int) \n 2. Integer(String) ");
		System.out.println("Enter an integer value::");
		int x= Integer.parseInt(s.nextLine());
		System.out.println("==========Performing wrapping with Integer constructor==========");
		Integer X= new Integer(x);
		System.out.println("After wrapping::"+X);
		System.out.println("==========Performing wrapping with String constructor==========");
		System.out.println("Enter a String for wrapping::");
		String str= s.nextLine();
		Integer st= new Integer(str);
		System.out.println("After perofrming wrapping with String constr::"+st.toString());
		
		
		}catch(NumberFormatException e) {
			e.printStackTrace();
			System.out.println("Only integer value are allowed");
		}

	}

}

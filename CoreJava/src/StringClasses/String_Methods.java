package StringClasses;

import java.util.Scanner;

public class String_Methods {

	public static void main(String[] args) {
		System.out.println("String class have 16 constr which is max of all classes in Java ");
		Scanner s= new Scanner(System.in);
		System.out.println("Enter string 1:");
		String str1=s.nextLine();
		String str2= new String("lang");
		String str3="hello world";
		String str4=str3;
		System.out.println("======String methods===========");
		System.out.println("String 1:"+str1);
		System.out.println("String 2:"+str2);
		System.out.println("String 3:"+str3);
		System.out.println("String 4:"+str4);
		System.out.println("Length of String4::"+str4.length());
		System.out.println("Char at index 5 ::"+str4.charAt(6));
		System.out.println("Sub String (2,7)::"+str4.substring(2,7));
		System.out.println("Replace a with z ::"+str4.replace('l','z'));
		System.out.println("UpperCase::"+str4.toUpperCase());

	}

}

package StringClasses;

import java.util.Scanner;

public class String_equalsNcompareToMethods {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter s1 String:");
		String s1 = s.nextLine();
		System.out.println("Enter String s2:");
		String s2 = s.nextLine();
		System.out.println("======equals() method==========");
		System.out.println("Equals method returns boolean");
		boolean b = s1.equals(s2);
		if (b)
			System.out.println("Both strings are equal");

		else
			System.out.println("Strings are not equal");
		System.out.println("=====compareTo() method=====");
		System.out.println("compareTo() method returns int value");
		int z = s1.compareTo(s2);
		if (z == 0)
			System.out.println("Strings are equals");
		if (z > 0)
			System.out.println("String s1 is larger than s2");
		if (z < 0)
			System.out.println("String s1 is smaller than s2");
		
	}
}
package StringClasses;

import java.util.Scanner;
import java.util.StringTokenizer;

public class String_StringTokenizer {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter a string::"); 
		String str= s.nextLine();
		StringTokenizer st= new StringTokenizer(str,"");
		System.out.println("=======Output========");
		while(st.hasMoreTokens()) {
			StringBuffer sb= new StringBuffer(st.nextToken());
			System.out.println("Reverse of the String is ::"+sb.reverse()); 
		}

	}

}

package StringClasses;

import java.util.*;
public class StringBufferMethods {

	public static void main(String[] args) {
		StringBuffer sb= new StringBuffer();
		System.out.println("StringBuufer default capacity::"+sb.capacity());
		sb.append("Java");
		System.out.println("Length of sb::"+sb.length());
		System.out.println("Sb:"+sb);
		sb.insert(4, "Language");
		System.out.println("Sb:"+sb);
		System.out.println("Length of sb::"+sb.length());
		System.out.println("Capacity:"+sb.capacity());

	}

}

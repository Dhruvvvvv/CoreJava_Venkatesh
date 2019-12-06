package StringClasses;

import java.util.Scanner;
import java.util.StringJoiner;

public class String_StringJoiner {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		StringJoiner sj= new StringJoiner("/");
		System.out.println("Enter Date::");
		String date=s.nextLine();
		System.out.println("Enter Month::");
		String month= s.nextLine();
		System.out.println("Enter Year::");
		String year=s.nextLine();
		sj.add(date);
		sj.add(month);
		sj.add(year);
		System.out.println("Date Foramt:: "+sj.toString());
	}

}

package Array;

import java.util.Scanner;

class Book {
	private String bName, bId;
	private float bPrice;

	public Book(String bName, String bId, float bPrice) {
		this.bName = bName;
		this.bId = bId;
		this.bPrice = bPrice;
	}

	public String toString() {
		return "Book Name:" + bName +"\nBook Id:" + bId +  "\nBook Price:" + bPrice;
	}
}

public class Array1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number of book details::");
		Integer n = Integer.parseInt(s.nextLine());
		Book b[] = new Book[n];
		System.out.println("=======Enter the book details====");
		for (int i = 0; i < n; i++) {
			System.out.println("Enter the bName:");
			String bName=s.nextLine();
			System.out.println("Enter the bId:");
			String bId=s.nextLine();
			System.out.println("Enter the bPrice:");
			Float bPrice=Float.parseFloat(s.nextLine());
			b[i] = new Book( bName,bId, bPrice);
		}
		System.out.println("=====Details=======");
		for (Book k : b) {
			System.out.println( k);
		}

	}

}

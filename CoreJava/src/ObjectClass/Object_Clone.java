package ObjectClass;

import java.util.Scanner;

class Book implements Cloneable{
	String bId, bName;
	float bPrice;
	 Book(String bId, String bName, float bPrice) {
		this.bId=bId;
		this.bName=bName;
		this.bPrice=bPrice;
	}
	 
	public Object toClone() {
		Object o=null;
		try {
			o= this.clone();
			
		}catch(CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return o;
	}
	public String toString() {
		return "Book ID:"+bId+"\nBook Name:"+bName+"\nBook Price:"+bPrice;
	}
}
public class Object_Clone {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter book id:");
		String bId=s.nextLine();
		System.out.println("Enter the book name:");
		String bName= s.nextLine();
		System.out.println("Enter the book price:");
		Float bPrice= Float.parseFloat(s.nextLine());
		Book b= new Book(bId,bName,bPrice);
		System.out.println("=======Original Object======");
		System.out.println(b.toString());
		System.out.println("Hashcode:"+b.hashCode());
		System.out.println("=======PERFORMING CLONING=============");
		Book ob=(Book)b.toClone();
		System.out.println("Duplicate object details");
		System.out.println(ob.toString());
		System.out.println("Hashcode: "+ob.hashCode());
		 

	}

}

package IOPackage;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Date;

class Serialz implements Serializable{
	private String name;
	private double id;
	private Date date;
	private float amt;
	
	public Serialz(String name, double id,Date date,float amt) {
		this.name=name;
		this.id=id;
		this.date=date;
		this.amt=amt;
	}
	public String toString() {
		return "Name:"+name+"\nId:"+id+"\nDate:"+date+"\nAmount:"+amt;
	}
}
public class SerializationExample {

	public static void main(String[] args) throws IOException {
		Serialz sz= new Serialz("Java", Math.random(),new Date(),20023.4f);
		FileOutputStream fis= new FileOutputStream("C:\\Users\\Shahan\\Deskto\\Object.txt");
		ObjectOutputStream oos= new ObjectOutputStream(fis);
		oos.writeObject(sz);
		System.out.println("Object is stored successfully..!");


	}

}

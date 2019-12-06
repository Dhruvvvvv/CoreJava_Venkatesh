package Collections;

import java.util.Enumeration;
import java.util.Vector;

class Course4 {
	private String name;
	private int id;
	private float price;

	public Course4(String name, int id, float price) {
		this.name = name;
		this.id = id;
		this.price = price;
	}

	public String toString() {
		return "Name:" + name + "\nId:" + id + "\nPrice:" + price;
	}

}

public class VectorClass {

	public static void main(String[] args) {
		Vector<Course4> v = new Vector<Course4>();
		v.add(new Course4("Core Java", 1, 100.0f));
		v.add(new Course4("Adv Java", 2, 200.0f));
		v.add(new Course4("Oracle", 3, 300.0f));
		v.add(new Course4("Hibernate", 4, 400.0f));
		System.out.println("==Course details===");
		v.forEach(z -> {
			System.out.println(z);
		});
		System.out.println("====With Enumeration iterator====");
		Enumeration<Course4> em = v.elements();
		while (em.hasMoreElements()) {
			System.out.println(em.nextElement());
		}

	}

}

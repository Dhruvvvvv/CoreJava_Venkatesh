package Collections;

import java.util.LinkedList;

class Course3 {
	private String name;
	private int id;
	private float price;

	public Course3(String name, int id, float price) {
		this.name = name;
		this.id = id;
		this.price = price;
	}

	public String toString() {
		return "Name:" + name + "\nId:" + id + "\nPrice:" + price;
	}

}

public class LinkedListClass {

	public static void main(String[] args) {

		LinkedList<Course3> ll = new LinkedList<Course3>();
		ll.add(new Course3("Core Java", 1, 100.0f));
		ll.add(new Course3("Adv Java", 2, 200.0f));
		ll.add(new Course3("Oracle", 3, 300.0f));
		ll.add(new Course3("Hibernate", 4, 400.0f));
		System.out.println("===Course details====");
		ll.forEach(z -> {
			System.out.println(z);
		});

	}

}

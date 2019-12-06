package Collections;

import java.util.Stack;

class Course5 {
	private String name;
	private int id;
	private float price;

	public Course5(String name, int id, float price) {
		this.name = name;
		this.id = id;
		this.price = price;
	}

	public String toString() {
		return "Name:" + name + "\nId:" + id + "\nPrice:" + price;
	}

}

public class StackClass {

	public static void main(String[] args) {
		Stack<Course5> st = new Stack<Course5>();
		st.add(new Course5("Core Java", 1, 100.0f));
		st.add(new Course5("Adv Java", 2, 200.0f));
		st.add(new Course5("Oracle", 3, 300.0f));
		st.add(new Course5("Hibernate", 4, 400.0f));
		System.out.println("==Course details===");
		st.forEach(z -> {
			System.out.println(z);
		});

		System.out.println("\nPeek element::" + st.peek());
		System.out.println("Poping element::" + st.pop());
		System.out.println("After poping elemnts are:");
		st.forEach(z -> {
			System.out.println(z);
		});
	}

}

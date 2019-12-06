package Collections;

import java.util.ArrayList;
import java.util.function.Predicate;

class Course6 implements Comparable {
	private String name;
	public int id;
	private float price;

	public Course6(String name, int id, float price) {
		this.name = name;
		this.id = id;
		this.price = price;
	}

	public String toString() {
		return "Name:" + name + "\nId:" + id + "\nPrice:" + price;
	}

	public int compareTo(Object o) {

		Course6 c = (Course6) o;
		if (id == c.id)
			return 0;
		else if (id > c.id)
			return 1;
		else
			return -1;
	}
}

public class PredicateConceptJava8 {

	public static void main(String[] args) {
		ArrayList<Course6> al = new ArrayList<Course6>();
		al.add(new Course6("Java", 1, 100.1f));
		al.add(new Course6("Core Java", 2, 200.1f));
		al.add(new Course6("Adv Java", 3, 300.1f));
		al.add(new Course6("Spring ", 4, 400.1f));
		al.add(new Course6("Hibernate", 5, 500.1f));

		System.out.println("==Course details===");
		al.forEach(z -> {
			System.out.println(z);
		});
		System.out.println("==With Predicate===");
		Predicate<Course6> p = k -> k.id <= 4;
		System.out.println("==Course6 with id<=4");
		al.forEach(z -> {
			if (p.test(z)) {
				System.out.println(z);
			}
		});
	}

}

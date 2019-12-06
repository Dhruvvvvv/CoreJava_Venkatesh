package Collections;

import java.util.Iterator;
import java.util.TreeSet;

class Course1 implements Comparable {
	private String name;
	private int id;
	private float price;

	public Course1(String name, int id, float price) {
		this.name = name;
		this.id = id;
		this.price = price;
	}

	public String toString() {
		return "Name:" + name + "\nId:" + id + "\nPrice:" + price;
	}

	public int compareTo(Object o) {

		Course1 c = (Course1) o;
		if (id == c.id)
			return 0;
		else if (id > c.id)
			return 1;
		else
			return -1;
	}
}

public class Set2_TreeSetConcept {

	public static void main(String[] args) {

		TreeSet<Course1> ts = new TreeSet<Course1>();
		ts.add(new Course1("Core java", 1, 100.0f));
		ts.add(new Course1(" Hib", 2, 200.0f));
		ts.add(new Course1(" Oracle", 3, 300.0f));
		ts.add(new Course1("Spring", 4, 400.0f));
		System.out.println("====Dis in ascending order(default)====");
		ts.forEach(t -> {
			System.out.println(t);
		});

		System.out.println("====Dis in desc orer====");
		Iterator<Course1> it = ts.descendingIterator();
		it.forEachRemaining(p -> {
			System.out.println(p);
		});

		System.out.println("====Integer objects====");
		TreeSet<Integer> t = new TreeSet<Integer>();
		t.add(1);
		t.add(2);
		t.add(3);
		System.out.println("====Dis in asced order (default)====");
		t.forEach(s -> {
			System.out.println(s);
		});
		System.out.println("===Dis in desc order====");
		Iterator<Integer> in = t.descendingIterator();
		in.forEachRemaining(r -> {
			System.out.println(r);
		});

	}

}

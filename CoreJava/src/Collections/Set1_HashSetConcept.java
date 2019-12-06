package Collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.Spliterators;

class Course {
	private String name, id;
	private float price;

	public Course(String name, String id, float price) {
		this.name = name;
		this.id = id;
		this.price = price;
	}

	public String toString() {
		return "Name:" + name + "\nId:" + id + "\nPrice:" + price;
	}
}

public class Set1_HashSetConcept {

	public static void main(String[] args) {
		HashSet<Course> s = new HashSet<Course>();
		s.add(new Course("Core Java", "11", 100.0f));
		s.add(new Course("Adv Java", "22", 200.0f));
		s.add(new Course("Oracle", "33", 300.0f));
		s.add(new Course("Hibernate", "44", 400.0f));
		System.out.println("====Details====");
		Iterator<Course> it1 = s.iterator();
		System.out.println("===Dis using iterator===");
		while (it1.hasNext()) {
			Course c = it1.next();
			System.out.println(c);
		}

		System.out.println("===Dis using new forEachRemaining Java8===");
		Iterator<Course> it2=s.iterator();
		it2.forEachRemaining(x -> {
			System.out.println(x);
		});

		System.out.println("===Dis using SplitIterator====");
		Spliterator<Course> it3 = s.spliterator();
		it3.forEachRemaining(z -> {
			System.out.println(z);
		});
		
		System.out.println("===Dis using forEach Java8====");
		s.forEach(e->{
			System.out.println(e);
		});

	}

}

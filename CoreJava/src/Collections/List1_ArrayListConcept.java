package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.ListIterator;

class Course2 implements Comparable {
	private String name;
	private int id;
	private float price;

	public Course2(String name, int id, float price) {
		this.name = name;
		this.id = id;
		this.price = price;
	}

	public String toString() {
		return "Name:" + name + "\nId:" + id + "\nPrice:" + price;
	}

	public int compareTo(Object o) {

		Course2 c = (Course2) o;
		if (id == c.id)
			return 0;
		else if (id > c.id)
			return 1;
		else
			return -1;
	}
}

public class List1_ArrayListConcept {

	public static void main(String[] args) {
		ArrayList<Course2> al = new ArrayList<Course2>();
		al.add(new Course2("Java", 1, 100.1f));
		al.add(new Course2("Core Java", 2, 200.1f));
		al.add(new Course2("Adv Java", 3, 300.1f));
		al.add(new Course2("Spring ", 4, 400.1f));
		al.add(new Course2("Hibernate", 5, 500.1f));

		System.out.println("===Before Sorting Course Details====");
		ListIterator<Course2> lt = al.listIterator();
		System.out.println("====Forward dir====");
		while (lt.hasNext()) {
			System.out.println(lt.next());
		}

		System.out.println("===Backward dir====");
		while (lt.hasPrevious()) {
			System.out.println(lt.previous());
		}
		System.out.println("===After sorting====");
		Collections.sort(al);
		System.out.println("======Forward dir=======");
		ListIterator<Course2> lt2 = al.listIterator();
		while (lt2.hasNext()) {
			System.out.println(lt2.next());
		}
		System.out.println("====Backward dir=====");
		while (lt2.hasPrevious()) {
			System.out.println(lt2.previous());
		}

	}

}

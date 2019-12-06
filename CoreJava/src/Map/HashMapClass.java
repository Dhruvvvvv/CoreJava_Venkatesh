package Map;

import java.util.HashMap;
import java.util.function.BiPredicate;

class Emp {
	String name, id, desg;
	double sal;

	public Emp(String name, String id, String desg, double sal) {
		this.name = name;
		this.id = id;
		this.desg = desg;
		this.sal = sal;
	}

	public String toString() {
		return "Name:" + name + "\nId:" + id + "\nDesg:" + desg + "\nSal:" + sal;
	}
}

public class HashMapClass {

	public static void main(String[] args) {
		HashMap<String, Emp> hm = new HashMap<String, Emp>();
		hm.put("A1", new Emp("Java", "1", "SE", 1000));
		hm.put("A4", new Emp("Core Java", "4", "SC", 4000));
		hm.put("A3", new Emp("Adv Java", "3", "DEV", 3000));
		hm.put("A5", new Emp("Spring", "5", "JE", 2000));
		System.out.println("====Display using forEach======");
		hm.forEach((p, q) -> {
			System.out.println(p + ": " + q);
		});

		System.out.println("=====Display using BiPredicate====");
		BiPredicate<String, Emp> p = (a, b) -> b.sal <= 2000;
		hm.forEach((m, n) -> {
			if (p.test(m, n)) {
				System.out.println(m + ": " + n);
			}
		});

	}

}

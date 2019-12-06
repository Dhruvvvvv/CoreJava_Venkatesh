

import java.util.ArrayList;
import java.util.List;

public class JarProblem {
	public static double actualWeight = 0.0;
	public static double expectedWeight = 0.0;

	public static void main(String[] args) {
		List<Jar10> listOfJar = new ArrayList<Jar10>();

		listOfJar.add(new Jar10(1, 10, 10));
		listOfJar.add(new Jar10(2, 20, 10));
		listOfJar.add(new Jar10(3, 30, 10));
		listOfJar.add(new Jar10(4, 40, 10));
		listOfJar.add(new Jar10(5, 50, 1.1));

		int ab = jarWithDiffWeightOfPills(listOfJar);
		System.out.println("Jar number: " + ab);

	}

	public static int jarWithDiffWeightOfPills(List<Jar10> listOfJar) {
		for (Jar10 j : listOfJar) {
			actualWeight = actualWeight + j.getJarNumber() * j.getWeightOfEach();
			expectedWeight= expectedWeight+j.getJarNumber()*10;
		}
		System.out.println("Actual weight: " + actualWeight);
		System.out.println("Expected weight: "+expectedWeight);
		int a = (int) (actualWeight % 10);
		System.out.println("int: " + a);
		return a;
	}

}

class Jar10 {
	private int jarNumber;
	private int numberOfPills;
	private double weightOfOnePill;

	public Jar10(int jarNumber, int numberOfPills, double d) {
		this.jarNumber = jarNumber;
		this.numberOfPills = numberOfPills;
		this.weightOfOnePill = d;
	}

	public int getJarNumber() {
		return jarNumber;
	}

	public void setJarNumber(int jarNumber) {
		this.jarNumber = jarNumber;
	}

	public int getNumberOfPills() {
		return numberOfPills;
	}

	public void setNumberOfPills(int numberOfPills) {
		this.numberOfPills = numberOfPills;
	}

	public double getWeightOfEach() {
		return weightOfOnePill;
	}

	public void setWeightOfEach(double weightOfOnePill) {
		this.weightOfOnePill = weightOfOnePill;
	}

}

package test1;

class Dis {
	static int k=10;
	void getStaticValue()
	{
		k++;
		System.out.println("Static value of k: "+k);
	}

}

public class Static_var {
	public static void main(String[] args) {
		Dis d1= new Dis();
		Dis d2= new Dis();
		d1.getStaticValue();
		d2.getStaticValue();
		
	}

}

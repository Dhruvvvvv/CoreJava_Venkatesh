package test1;

class Display{
	int k=10;
	void getNonStaticValue()
	{
		System.out.println("Value of k is :"+ k);
	}

}

public class Non_static_var {
	public static void main(String[] args) {
		Display d1= new Display();
		d1.getNonStaticValue();
		Display d2= new Display();
		d2.getNonStaticValue();
	}
	

}

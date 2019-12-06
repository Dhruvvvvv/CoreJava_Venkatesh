package test1;

class Constr {
	public Constr()
	{
		System.out.println("Zero param constructor executed while object creation");
	}
	public Constr(int x)
	{
		System.out.println("==============================");
		System.out.println("Single param constructor executed");
		System.out.println("Value passed to constructor while object creation is: "+x);
	}
	public Constr(int x , int y)
	{
		System.out.println("==============================");

		System.out.println("Double param constructor");
		System.out.println("Values passed to constructor are: "+x+ ","+ y);
	}
}
public class ZeronParamConstr {

	public static void main(String[] args) {
		Constr c0= new Constr();
		Constr c1= new Constr(123);
		Constr c2= new Constr(123,124);
	}
}

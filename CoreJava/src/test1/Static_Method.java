package test1;

class Display1{
	int a= 10;
	static int b=20;
	
	public void getInstanceVar(){
		System.out.println("========Instance method======");
		System.out.println("Instance variable is : "+a);
		System.out.println("Static variable is : "+b);
	}
	public static void getStaticVar()
	{
		System.out.println("========Static method======");
	//	System.out.println("instance variable is : "+a);
		System.out.println("Static variable is : "+b);		
	}
}
public class Static_Method {
	public static void main(String[] args) {
		Display1 d= new Display1();
		d.getInstanceVar();
		Display1.getStaticVar();
		
		
	}

}

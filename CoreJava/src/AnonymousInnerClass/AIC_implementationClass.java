package AnonymousInnerClass;

import java.util.Scanner;

interface Inter{
	public abstract int comapreTo(int x, int y);
}
public class AIC_implementationClass {

	public static void main(String[] args) {
		Inter in= new Inter() {

			@Override
			public int comapreTo(int x, int y) {
				if(x>y)
					return x;
				else 
					return y;
			}
		};
		
		Scanner s= new Scanner(System.in);
		System.out.println("Enter to value to find greater one::");
		int x= Integer.parseInt(s.nextLine());
		int y=Integer.parseInt(s.nextLine());
		System.out.println("Greater one is: "+in.comapreTo(x, y));

	}

}

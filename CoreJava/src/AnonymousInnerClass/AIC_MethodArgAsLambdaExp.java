package AnonymousInnerClass;

import java.util.Scanner;

interface Inter2 {
	public abstract int compareTo(int x, int y);
}

class Calculate {
	public void cal(int x, int y, Inter1 gt) {
		System.out.println("Greater:" + gt.comapreTo(x, y));
	}
}

public class AIC_MethodArgAsLambdaExp {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter two values:");
		int a=Integer.parseInt(s.nextLine());
		int b=Integer.parseInt(s.nextLine());
		Calculate c= new Calculate();
		c.cal(a, b, (int x, int y)->
			{
				if(x>y)
					return x;
				else 
					return y;
		});

	}
}

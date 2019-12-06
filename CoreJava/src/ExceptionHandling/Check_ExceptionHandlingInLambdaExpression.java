package ExceptionHandling;

import java.util.Scanner;

interface Itest{
	public int compareTo(int x , int y)throws Exception;
}
public class Check_ExceptionHandlingInLambdaExpression {

	public static void main(String[] args) {
		try {
			Scanner s= new Scanner (System.in);
			Itest t= (int x, int y)->
			{
				if(x==y) {
					Exception ex= new Exception ("Both are equal");
					throw ex;
				}
				if (x>y) {
					System.out.println("Greater one is::"+x);
					return x;
				}
				else {
					System.out.println("Greater one is::"+y);
					return y;
				}
			};
			System.out.println("Enter the value of x::");
			int x= Integer.parseInt(s.nextLine());
			System.out.println("Enter the value of y::");
			int y= Integer.parseInt(s.nextLine());
			t.compareTo(x, y);
			
		}catch(Exception e) {
			System.out.println("Details of exception ::"+e.getMessage());
		}

	}

}

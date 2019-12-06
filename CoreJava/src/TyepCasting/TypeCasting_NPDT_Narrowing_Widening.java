package TyepCasting;

public class TypeCasting_NPDT_Narrowing_Widening {

	public static void main(String[] args) {
		int x=64;
		char y= 'A';
		System.out.println("================Widending process=============");
		int z=y;
		System.out.println("Char has been widen to int :"+z);
		System.out.println("==============Narrowing process===============");
		char p= (char)x;
		System.out.println("int value narrowed to char::"+p);

	}

}

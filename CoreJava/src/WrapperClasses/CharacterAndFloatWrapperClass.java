package WrapperClasses;

public class CharacterAndFloatWrapperClass {

	public static void main(String[] args) {
		System.out.println("Character wrapper class constr:: \n 1. Charactor(char)");
		System.out.println("Float wrapper class constr:: \n 1. Float(float)\n 2. Float(double)\n 3. Float(String)\n");
		System.out.println("============Float Wrapper==================");
		Float f1= new Float(123.34556f);// Float(float)
		Float f2= new Float(123.64342); //Float(double)
		Float f3= new Float("23455.345"); //Float(String)
		System.out.println("F1:"+f1);
		System.out.println("F2:"+f2);
		System.out.println("F3:"+f3);
		System.out.println("====================Character Wrapper=================");
		Character ch= new Character('A');
		System.out.println("Char:"+ch.toString());

	}

}

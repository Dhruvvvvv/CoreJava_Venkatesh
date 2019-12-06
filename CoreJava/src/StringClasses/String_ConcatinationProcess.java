package StringClasses;

public class String_ConcatinationProcess {

	public static void main(String[] args) {
		String s1= new String("Java");
		String s2= new String("Language");
		String s3=s1.concat(s2);
		System.out.println("=======Concatination===========");
		System.out.println("String obj are immutable so every obj'll hv unique hashcode");
		System.out.println("HashCode of s1: "+s1.hashCode());
		System.out.println("HashCode of s2: "+s2.hashCode());
		System.out.println("HashCode od s3: "+s3.hashCode());

	}

}

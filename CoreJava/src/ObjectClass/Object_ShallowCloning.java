package ObjectClass;
 class Address{
	 public String hNo="207,Baflah Classic Homes";
 }
 
 class Employee implements Cloneable{
	 public String name="Java";
	 
	 class Desg{
		 public String desg="Dev";
	 }//Inner Class
	 
	 Desg des= new Desg();// Inner Class Object
	 Address addr= new Address();//Referenced class object
	 @Override
	 public String toString() {
		 return "House No:"+addr.hNo+"\nName:"+name+"\nDesg:"+des.desg; 
	 }
	 public Object toClone() {
		 Object o=null;
		 try {
			 o=this.clone();
		 }catch(CloneNotSupportedException e) {
			 e.printStackTrace();
		 }
		 return o;
	 }
 }
public class Object_ShallowCloning {

	public static void main(String[] args) {
		//Original Object
		Employee emp1= new Employee();
		System.out.println("====Original object=======");
		System.out.println(emp1.toString());
		System.out.println("HashCode of emp1::"+emp1.hashCode());
		System.out.println("HashCode of Desg1::"+emp1.des.hashCode());
		System.out.println("HashCode of Address1::"+emp1.addr.hashCode());
		//Clone Object
		System.out.println("=====Duplicate Object=======");
		Employee emp2=(Employee)emp1.toClone();
		System.out.println(emp2.toString());
		System.out.println("HashCode of emp2::"+emp2.hashCode());
		System.out.println("HashCode of Desg2::"+emp2.des.hashCode());
		System.out.println("HashCode of Address2::"+emp2.addr.hashCode());
		System.out.println("NOTE:- In Shallow cloning inner and referenced clas objects willn't be cloned to get"
				+ "cloned them also go for Deep cloning");

	}

}

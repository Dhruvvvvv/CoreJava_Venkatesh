package ObjectClass;

class Address1 implements Cloneable{
	public String hNo="Baflah";
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

class Emp implements Cloneable{
	public String name="Java";
	
	class Desg1 implements Cloneable{
		public String desg="Dev";
		public Object toClone() {
			Object o=null;
			try {
				o=this.clone();
				
			}catch(CloneNotSupportedException e) {
				e.printStackTrace();
			}
			return o;
		}
	}//Innerclass
	Desg1 d= new Desg1();//Inner Class Object
	Address1 ad= new Address1(); //Referenced class object
	
	public Object toClone() {
		Emp e=null;
		try {
			e= (Emp) this.clone();
			e.d=(Desg1) e.d.toClone();
			e.ad=(Address1) e.ad.toClone();
		}catch(CloneNotSupportedException r) {
			r.printStackTrace();
		}
		return e;
	}
	public String toString() {
		return "House:"+ad.hNo+"\nName:"+name+"\nDesg:"+d.desg;
	}
}
public class Object_DeepCloning {

	public static void main(String[] args) {
		Emp emp1= new Emp();
		System.out.println("===========Original object=========");
		System.out.println("Emp1:\n"+emp1.toString());
		System.out.println("Desg1:"+emp1.d.hashCode());
		System.out.println("Address1:"+emp1.ad.hashCode());
		System.out.println("===========Duplicate object=========");
		Emp emp2= (Emp) emp1.toClone();
		System.out.println("Emp2:\n"+emp2.toString());
		System.out.println("Desg2:"+emp2.d.hashCode());
		System.out.println("Address2:"+emp2.ad.hashCode());
	
		

	}

}

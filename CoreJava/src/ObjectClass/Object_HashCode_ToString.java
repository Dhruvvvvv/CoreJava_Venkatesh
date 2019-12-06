package ObjectClass;

public class Object_HashCode_ToString {
	public int id;
	public String name;
	public long no;
	public Object_HashCode_ToString( int id , String name, long no) {
		this.id=id;
		this.name=name;
		this.no=no;
	}

	public static void main(String[] args) {
		System.out.println("NOTE:: HashCode of evry ob is unique and toString automatically executed if printing obj ref or name\n");
		System.out.println("=========HashCode of the Object======");
		Object_HashCode_ToString ob= new Object_HashCode_ToString(123, "Java", 9087654321L);
		System.out.println("HashCode:: "+ob.hashCode());
		System.out.println("==========toString============");
		System.out.println("Object details are::\n"+ob.toString());
		

	}
	public String toString() {
		return "ID:"+id+"\nName:"+name+"\nNumber:"+no; 
	}

}

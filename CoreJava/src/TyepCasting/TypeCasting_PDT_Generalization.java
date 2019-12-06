package TyepCasting;

class PClaz {
	int a = 2;

	public void mP() {
		System.out.println("PClaz method and var value is:" + a);
	}

	public void mP1() {
		System.out.println("Parent class method");
	}
}

class CClaz extends PClaz {
	int b = 23;

	public void mC() {
		System.out.println("CClaz method nad var value is:" + b);
	}

	public void mP() {
		System.out.println("PClaz ovveriding method in CCLaz");
	}
}

public class TypeCasting_PDT_Generalization {

	public static void main(String[] args) {
		PClaz obj = new CClaz();// Generalization Process
		// Obj 'll hv all feature frm PClazz and only overrding methods from cclazz
		obj.mP();
		obj.mP1();

	}

}

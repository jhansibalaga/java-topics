package inheritence;
class A{
	int a=30;
	void gill() {
		System.out.println("parent class");
	}
	A(){
		System.out.println("janu");
	}
}
class B extends A{
	int h=90;
	void kite() {
//		System.out.println("child class");
//		System.out.println(a);
		super.gill();
	}
}

public class single_inheritence {
	public static void main(String[] args) {
		B obj = new B();
		System.out.println(obj.a);
		obj.gill();
		System.out.println(obj.h);
		
	}

}

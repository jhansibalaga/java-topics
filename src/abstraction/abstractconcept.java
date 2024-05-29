package abstraction;
abstract class A{
	 static int a=10;
	abstract void run();
	abstract void fun();
	A(){
		System.out.println("i am a constructor");
	}
	static int kite() {
		int x = 30;
		int y = 57;
		int z = x+y;
		System.out.println("kite method");
		return z;
		
	}
}
class B extends A{
	void run() {
		System.out.println("run method");
	}
	void fun() {
		System.out.println("fun method");
	}
	B(){
		super();
	}
	
}

public class abstractconcept {
           public static void main(String[] args) {
			B ob = new B();
			System.out.println(A.a);
			ob.run();
			ob.fun();
//			A.kite();
			System.out.println(A.kite());
			String s="jhansi";
//			System.out.println(s.toLowerCase().charAt(0));
		}
}

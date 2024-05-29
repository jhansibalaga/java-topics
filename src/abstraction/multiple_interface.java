package abstraction;
//interface X {
//	abstract void boy();
//}
//interface Y {
//	abstract void girl();
//}
//class C implements X,Y{
//	public void boy() {
//		System.out.println("i am boy method");
//	}
//	public void girl() {
//		System.out.println("i am girl method");
//	}
//}
//public class multiple_interface {
//       public static void main(String[] args) {
//		 C bb = new C();
//		 bb.boy();
//		 bb.girl();
//	}
//}
interface s{
	abstract void aa();
	default int bb() {
		int a = 3;
		int b = 4;
		int c = a-b;
		return c;
	}
	public static void cc() {
		System.out.println("i am a static method");
	}
}
interface z{
	abstract void dd();
	default void ee() {
		System.out.println("i am a default method");
	}
	public static void ff() {
		System.out.println("i am a static method");
	}
}
class k implements s,z{
	public void aa() {
		System.out.println("i am abstract method");
	}
	public void dd() {
		System.out.println("i am also abstract method");
	}
}
public class multiple_interface {
	public static void main(String[] args) {
		k bb = new k();
		bb.aa();
		System.out.println(bb.bb());
		bb.dd();
		bb.ee();
		s.cc();
		z.ff();
		
	}
}
package polymorphism;
class XYZ{
	void max(){
		System.out.println("max method with no parameters");
	}
	int max(int a){
		System.out.println("max method with one parameter");
		return a;
	}
	int max(int a,int b){
		int c=a+b;
		System.out.println("max method with two parameters");
		return c;
		
	}
}
public class method_overloading {
             public static void main(String[] args) {
				XYZ bb = new XYZ();
				bb.max();
				System.out.println(bb.max(28));
				System.out.println(bb.max(23,34));
			}
}

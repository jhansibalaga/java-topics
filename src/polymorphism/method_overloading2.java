package polymorphism;
class den{
	void fact(int a) {
		System.out.println("integer type parameter");
	}
    void fact(float b) {
		System.out.println("float type parameter");
	}
   void fact(double c) {
	    System.out.println("double type parameter"); 
    }
}
public class method_overloading2 {
          public static void main(String[] args) {
			den bb = new den();
			bb.fact(10);
			bb.fact(30);
			bb.fact(40);
		}
}

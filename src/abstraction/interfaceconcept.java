package abstraction;
interface shape{
	public final int x = 20;
	final float y = 3.2f;
	static double z= 34.56f;
	abstract void circle();
	static void rectangle() {
		System.out.println("area of rectangle : l*b");
	}
	default void triangle() {
		System.out.println("area of the triangle : 1/2 * b * h");
	}
}
class shape1 implements shape{
	public void circle() {
		System.out.println("area of circle : pi * r * r");
	}
}
public class interfaceconcept {
	public static void main(String[] args) {
		shape1 ob = new shape1();
		ob.circle();
		ob.triangle();
		shape.rectangle();
		System.out.println(shape.x);
		System.out.println(shape.y);
		System.out.println(shape.z);
		
	}

}

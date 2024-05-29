package encapsulation1;

public class encapsulation {
	protected int age=25;
	private String s = "jhansi";
	private float f = 23.21f;
	public encapsulation() {
		System.out.println(age);		
	}
	protected void react() {
		System.out.println("react method");
	}
//	default void ben() {
//		System.out.println("i am a ben method");
//	}
     public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getS() {
		return s;
	}
	public void setS(String s) {
		this.s = s;
	}
	public float getF() {
		return f;
	}
	public void setF(float f) {
		this.f = f;
	}
	public static void main(String[] args) {
		encapsulation bb = new encapsulation();
		System.out.println(bb.age);
		bb.react();
	} 
}

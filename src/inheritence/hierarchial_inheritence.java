package inheritence;

class animal{
	void sleep() {
		System.out.println("animal can sleep");
	}
}
class dog extends animal{
	void bow() {
		System.out.println("dog says bow");
	}
}
class cat extends animal{
	void meow() {
		System.out.println("cat says meow");
	}
}
public class hierarchial_inheritence {
	public static void main(String[] args) {
		
		dog ob = new dog();
		  ob.bow();
		  ob.sleep();
		  
		cat bb = new cat();
		bb.meow();
		bb.sleep();
	}
	 
	 

}

package abstraction;
interface jhansi{
	String a = "jhansi";
    abstract void  red();
	static String janu() {
		String x = "jha";
		String y = "nsi";
		String z = x+y;
		return z;
	}
}
interface mounika{
	int b = 20;
	int c = 40;
	abstract void blue();
	static void mouni() {
		System.out.println("mounika is my friend");
	}
}
class janu implements jhansi{
	 public void red() {
		System.out.println("red color");
	}
	
}
class mouni implements mounika{
	public void blue() {
		System.out.println("blue color");
	}
}
public class interface2 {
	public static void main(String[] args) {
		janu bb = new janu();
		mouni ob = new mouni();
		jhansi.janu();
		bb.red();
		System.out.println(bb.a);
		mounika.mouni();
		ob.blue();
		System.out.println(ob.b);
		System.out.println(ob.c);
	}

}

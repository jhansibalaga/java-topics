package oops;
class friend2{
	String name ="janu";
	int age = 20;
}
class friend{
	String name = "mouni";
	int age = 18;
	String best() {
		String x = "janu";
		String y = "mouni";
		String c = x+y;
		return c;
	}
	friend(int a, int b){
		System.out.println(a+b);
	}
}
public class demo {
	public static void main(String[] args) {
		friend ob = new friend(11,2);
		System.out.println(ob.name);
		System.out.println(ob.age);
		System.out.println(ob.best());
		friend2 obj = new friend2();
		System.out.println(obj.name);
	}

}

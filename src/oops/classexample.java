package oops;
class max{
	int a=10;
	float b= 30.2f;
	int min() {
		int x= 10;
		int y=20;
		int result=x+y;
		return result;
	}
	max(){
		System.out.println("constructor invoked");
	}
}

public class classexample {
	public static void main(String[] args) {
		max obj = new max();
		System.out.println(obj.a);
		System.out.println(obj.b);
		System.out.println(obj.min());
	}

}

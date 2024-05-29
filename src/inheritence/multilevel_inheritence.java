package inheritence;
class ab{int h=30;}
class bb extends ab{int i=40;}
class cc extends bb{int j=50;}
public class multilevel_inheritence {
	public static void main(String[] args) {
		cc obj = new cc();
		System.out.println(obj.h);
		System.out.println(obj.i);
		System.out.println(obj.j);
	}

}

package inheritence;
class x {int a=20;}
class y extends x{float b=3.2f;
y(){
	 System.out.println("constructor of y");}
}
class z extends y{String c="jhansi";
z(){
	super();
}
}
class w extends x{double d= 567.34f;}
public class hybrid_inheritence {
          public static void main(String[] args) {
        	y o = new y();  
			z ob = new z();
			System.out.println(ob.a);
			System.out.println(ob.b);
			System.out.println(ob.c);
			w bb = new w();
			System.out.println(bb.d);
		}
}

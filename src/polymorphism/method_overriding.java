package polymorphism;
class shapes{
	void draw() {
		System.out.println("shapes class draw method");
	}
}
class pentagon extends shapes{
	void draw() {
		System.out.println("pentagon draw method");
	}
}
class hexagon extends shapes{
	void draw() {
		System.out.println("hexagon draw method");
	}
}
class octagon extends shapes{
	void draw() {
		System.out.println("octagon draw method");
	}
}
public class method_overriding {
            public static void main(String[] args) {
//            	 octagon oct = new octagon();
//            	 oct.draw();
//            	 pentagon pent = new pentagon();
//            	 pent.draw();
//            	 hexagon hex = new hexagon();
//            	 hex.draw();
//				shapes oct = new octagon();
//				oct.draw();
//				shapes hex = new hexagon();
//				hex.draw();
//				shapes pent = new pentagon();
//				pent.draw();

               shapes oct;
               oct = new shapes();
               oct.draw();
               oct = new octagon();
               oct.draw();
               oct = new pentagon();
               oct.draw();
               oct = new hexagon();
               oct.draw();
			}
}

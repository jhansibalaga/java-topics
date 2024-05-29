package oops;

import encapsulation1.encapsulation;
class encap extends encapsulation{
	void run() {
		 System.out.println(age);
    	 super.react();
    	 
    	 
	}
}
	
public class encap2 {
     public static void main(String[] args) {
    	 encap bb = new encap();
    	 System.out.println(bb.getAge());
    	 System.out.println(bb.getS());
    	 System.out.println(bb.getF());
    	 bb.run();
    	 bb.setAge(86);
    	 System.out.println(bb.getAge());
    	 bb.setS("mouni");
    	 System.out.println(bb.getS());
    	 bb.setF(67.12f);
    	 System.out.println(bb.getF());
    	 

    	 
	}
}

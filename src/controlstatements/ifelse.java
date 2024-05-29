package controlstatements;
import java.util.*;
public class ifelse {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter youe value");
		int a = sc.nextInt();
		System.out.println("enter youe value");
		int b =sc.nextInt();
		if(a>b) {
			System.out.println("a is greater");
		}
		else {
			if(b>a) {
				System.out.println("b is greater");
			}
		}
	}

}

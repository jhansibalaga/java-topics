package controlstatements;
import java.util.*;
public class nestedif {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your height");
		float height = sc.nextFloat();
		System.out.println("enter your weight");
		float weight = sc.nextFloat();
		System.out.println("enter your age");
		int age = sc.nextInt();
		
		if (height >= 5.7 && height <= 6.6) {
			if (weight >= 35 && weight <= 45) {
				if (age >= 25 && age <= 35) {
					System.out.println("you are eligible");
				}
			}
		}

		else {
			if (weight < 35 || weight > 45) {
				System.out.println("weight is not eligible");
			}
				if (age < 25 || age > 35) {
					System.out.println("age is not sufficient");
				}
					if (height < 5.7 || height > 6.6) {
						System.out.println("height is not sufficient");
					}

				}

			}
		
	}


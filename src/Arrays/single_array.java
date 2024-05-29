package Arrays;

public class single_array {
	public static void main(String[] args) {
		int[] i= {20,30,40};
		int [] j = new int[4];
		j[0]=23;
		j[1]=45;
		j[2]=12;
		System.out.println(j[1]);
//		for (int k=0;k<i.length;k++) {
//			System.out.print(i[k]);
//		}
//		i[0]=9;
//		i[1]=3;
//		System.out.println(i[0]);
//		int k=0;
//		while(k<i.length) {
//			System.out.println(i[k]);
//			k++;
//		}
		int x=0;
		do{
			System.out.println(i[x]);
			x++;
		}
		while(x<i.length);
		
			
		
	}

}

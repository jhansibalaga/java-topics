package example;

	import java.util.Scanner;

	public class sample {
	        public static void main(String[] args) {
				Scanner sc = new Scanner(System.in);
					int ch;
					do {
						displayelement();
						
						System.out.println("enter your choice");
						ch=Integer.parseInt(sc.nextLine());
						switch (ch) {
						case 1: 
							getallnames();
							break;
						case 2 :
							getallid();
							break;
						case 3 :
							getallemail();
							break;
						case 4 :
							getallmembers();
							break;
						case 5:
							System.exit(0);
							break;
						
						default:
							System.out.println("not find");
							break;
						}
					} while (ch>0);
					
				
			}

			private static void getallmembers() {
				// TODO Auto-generated method stub
				System.out.println("jhansi");
				
			}

			private static void getallemail() {
				// TODO Auto-generated method stub
				System.out.println("janu");
				
			}

			private static void getallid() {
				// TODO Auto-generated method stub
				System.out.println("den");
				
			}

			private static void getallnames() {
				// TODO Auto-generated method stub
				
				System.out.println("ben");
			}

			private static void displayelement() {
				// TODO Auto-generated method stub
				
				System.out.println("/t.jhansi");
				System.out.println("/t1.name");
				System.out.println("/t2.id");		
				System.out.println("/t3.email");
				System.out.println("/t4.member");
				
			}
	}



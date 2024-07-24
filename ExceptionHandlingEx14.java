package oca;


	public class ExceptionHandlingEx14 {
		public static void main(String[] args) {
			System.out.println("Hello");
			try {
				int a=12,b=0,r=0;
				r=a/b;
				System.out.println("Division: "+r);
			}finally { 
				System.out.println("INCAPP");
			}
			System.out.println("Bye");
		}

}

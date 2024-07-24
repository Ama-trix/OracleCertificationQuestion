package oca;

public class ExceptionHandlingEx6 {
	
		public static void main(String[] args) {
			System.out.println("Hello");
			int a=12,b=6,r=0,x[]= {4,0,8,5};
			try {
				r=a/b;
				System.out.println("Division: "+r);
				System.out.println(x[r]);
			}catch(ArrayIndexOutOfBoundsException ae) {
				System.out.println("paglat1");
			}catch(ArithmeticException ae) {
				System.out.println("paglat2");
			}
			System.out.println("Bye");
		
		}
}

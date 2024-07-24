package oca;

	public class ExceptionHandlingEx1 {
		public static void main(String[] args) {
			System.out.println("Hello");
			int a=12,b=0,r=0,x[]= {4,0,8,5};
			try {
				r=a/b;
				System.out.println("Division: "+r);
			}catch (ArithmeticException ex) {
				//System.out.println("Can not divide by Zero");
				System.out.println(ex);
			}
			try {
				System.out.println(x[20]);
			}catch (ArrayIndexOutOfBoundsException e) {
				//System.out.println("Index out of boundary");
				System.out.println(e);
			}
			System.out.println("Bye");
		}
	}



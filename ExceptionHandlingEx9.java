package oca;

public class ExceptionHandlingEx9 {
	public static void main(String[] args) {
		System.out.println("Hello");
		try {
			int a=12,b=0,r=0;
			r=a/b;
			System.out.println("Division: "+r);
		}catch (ArithmeticException e) {
			System.out.println(e);
		}finally { //only 1 finally block allowed
			System.out.println("INCAPP");
		}
		System.out.println("Bye");
	}

}

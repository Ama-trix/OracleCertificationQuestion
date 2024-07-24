package oca;

public class ExceptionHandlingEx12 {
	public static void main(String[] args) {
		System.out.println("Hello");
		int a=12,b=2,r=0,x[]= {4,0,8,5};
		try {
			r=a/b;
			System.out.println("Division: "+r);
			try {
				System.out.println(x[r]);
			}catch (ArrayIndexOutOfBoundsException ex) {
				System.out.println("out of index");
			}
		}catch (ArithmeticException ex) {
			System.out.println("can not divide by 0");
		}
		System.out.println("Bye");
	}

}

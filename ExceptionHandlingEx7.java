package oca;

public class ExceptionHandlingEx7 {
	public static void main(String[] args) {
		System.out.println("Hello");
		int a=12,b=0,r=0,x[]= {4,0,8,5};
		try {
			r=a/b;
			System.out.println("Division: "+r);
			System.out.println(x[r]);
		}catch(ArrayIndexOutOfBoundsException | ArithmeticException    ae) {
			System.out.println(ae);
		}
		System.out.println("Bye");
	}

}

package oca;

public class ExceptionHandlingEx3 {
	public static void main(String[] args) {
		System.out.println("Hello");
		try {
			String s=null;
			System.out.println(s.toUpperCase());
		}catch(NullPointerException ae) {
			System.out.println(ae);
		}
		System.out.println("Bye");
	}


}

package oca;

public class ExceptionHandlingEx2 {

	public static void main(String[] args) {
			System.out.println("Hello");
			try {
				String s="12hfgh3";
				int a=Integer.parseInt(s);
				System.out.println(a);
			}catch(NumberFormatException ae) {
				System.out.println(ae);
			}
			System.out.println("Bye");
		}
	

}

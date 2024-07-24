package oca;

class L{   }
class B extends L {  }
public class ExceptionHandlingEx4 {
	public static void main(String[] args) {
		System.out.println("Hello");
		try {
			L a=new L();
			B b=(B)a;
		}catch(ClassCastException ae) {
			System.out.println(ae);
		}
		System.out.println("Bye");
	}

	

}

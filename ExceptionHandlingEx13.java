package oca;

public class ExceptionHandlingEx13 {
	public static void main(String[] args) {
		System.out.println("Hello");
		int a=12,b=6,r=0;
		try {
			r=a/b;
			System.out.println("Division: "+r);
		//}catch(ArithmeticException ae) {
			//System.out.println("paglat1");
		//}catch(Exception ae) {
			//System.out.println("paglat2");
		//}
		
		 
		}catch(Exception ae) {
			System.out.println("paglat2");
		//}catch(ArithmeticException ae) {   //error - unreachable catch
			System.out.println("paglat1");
		
		}
		
	}

}

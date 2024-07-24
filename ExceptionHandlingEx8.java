package oca;

public class ExceptionHandlingEx8 {
	public static void main(String[] args) {
	System.out.println("Hello");
	int a=12,b=0,r=0,x[]= {4,0,8,5};
	try {
		r=a/b;
		System.out.println("Division: "+r);
		System.out.println(x[r]);
	}catch(Exception  ae) {
		//System.out.println("exception aaya re!");
		//System.out.println(ae.getMessage());
		//System.out.println(ae);
		//ae.printStackTrace();
	}
	System.out.println("Bye");
}


}

package oca;

public class OCATest2 {
	static int a;
	static Integer aa;
	public static void main(String[] args) {
		System.out.println(a);
		System.out.println(aa);
		
		 System.out.println(new Integer(5));//5
		 System.out.println(new Integer("5"));//5
		 System.out.println(new Boolean(true));//true
		 System.out.println(new Boolean(false));//false
		 //System.out.println(new Boolean(True));//error
		 System.out.println(new Boolean("true"));//true
		 System.out.println(new Boolean("false"));//false
		 System.out.println(new Boolean("True"));//true
		 System.out.println(new Boolean("TRUE"));//true
		 System.out.println(new Boolean("rahul"));//false
		 System.out.println(new Boolean(null));//false
		 
		 Boolean b[]=new Boolean[2];
		 System.out.println(b[0]);//null
		 boolean bb[]=new boolean[2];
		 System.out.println(bb[0]);//false
		 int a[]=new int[2];
		 System.out.println(a[0]);//0
		 Integer aa[]=new Integer[2];
		 System.out.println(aa[0]);//null
	}

}

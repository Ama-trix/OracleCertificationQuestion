package oca;
public class OCATest88 {
	public static void main(String[]args) {
		char[] a = { 'e', 's', 'p', 'r', 'e', 's', 's', 'o', '8', '9','0'};
		char[] b = { 'e', 's', 'p', 'r', 'e', 's', 's', 'o', '8', '9','0'};
		System.arraycopy(a, 2, b, 6, 5); //If length or index are out of boundary: ArrayIndexOutOfBoundsException
		//System.arraycopy(a, 2, a, 6, 5); 
		System.out.println(a); 
		System.out.println(b);
	}


}

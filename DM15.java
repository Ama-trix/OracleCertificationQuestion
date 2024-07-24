package oca;

public class DM15 {
	public static void main(String[]args) {
	int n=45;
	//if(++n%5==0) 
	if(n++%5==0)
	System.out.println("Hi"+n);
	else if(n>=n++)
	System.out.println("Hello"+n);
	else
	System.out.println("Bye");
}


}

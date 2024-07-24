package oca;

public class DM11 {
	public static void main(String[] args) {
		int x=10,y=5,a=9;
		
		//if(x++<y--)
		//if(++x!=--y)
		//System.out.println("Hello"+x+y);
		//else
		//System.out.println("Hi"+x+y);
		//else
		//System.out.println("Hoho"+x+y);

		 if(x++<y--){
		 	if(++x!=--y)
		 	System.out.println("Hello"+x+y);
		 	else
		 	System.out.println("Hi"+x+y);
		 }
		 else{
		 	System.out.println("Hoho"+x+y);
		 }
		
		System.out.println("Bye");
	}
}

package oca;
public class DM5 {
	static int a;
	int c;
	public static void main(String[] args) {
		int b;
		//System.out.println(b); //error
		System.out.println(a); 
		DM5 d=new DM5();
		System.out.println(d.c);
		//System.out.println(c); //error
		
		int x=9;
		int y;
		if(2<x){ 
			y=9;
			System.out.println("Hello"+y);
		}
		//System.out.println("Bye"+y);//error
	}

}
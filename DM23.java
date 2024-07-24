package oca;

public class DM23 {
	public static void main(String[] args) {
		//Only constant expression allowed in case
		int a=10,b=5;
		final int x=6;
		switch(a) {
			case 3+2:System.out.println("hello");
			case x:System.out.println("Hi");
			case x+1:System.out.println("Hi");
			case 7/2:System.out.println("Hi");
			//case (7.0/2):System.out.println("Hi");//error
			//case x<1:System.out.println("Hi");//error
			//case b:System.out.println("yoyo");//error
		}
		System.out.println("bye");
	}

}

package oca;

public class ocatest17 {
	public static void main(String[] args) {
		for(int x=1;x<5;x++);{
			System.out.println("hi");
			System.out.println("hello");
		}
		for(int x=1;x<5;x++){
			System.out.println("hi");
			System.out.println("hello");
		}
		for(int x=1;x<5;x++,System.out.println("rahul"));{
			System.out.println("hi");
			System.out.println("hello");
		}
		for(int x=1;x<5;x++,System.out.println("rahul"),System.out.println("hi"))
		System.out.println("hello");
		
//error //for(int x=1,System.out.println("ok");x<5;x++,System.out.println("rahul"),System.out.println("hi"))
		//System.out.println("hello");
		
		int x;
		for(x=1,System.out.println("ok");x<5;x++,System.out.println("rahul"),System.out.println("hi"))
		System.out.println("hello");
		
		
		for(x=1,System.out.println("ok");x<5;x++,System.out.println("rahul"),System.out.println("hi"));
		System.out.println("hello");
	}
}



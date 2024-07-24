package oca;

public class DM17 {
	public static void main(String[] args) {
		int a=2;
		switch(a) {
			case 1: 
				System.out.println("hello");
				break;
				//System.out.println("kk");//error
			case 2:{
				System.out.println("Hi");
				break;
			}
			case 4:
				System.out.println("ok");
		}
		System.out.println("bye");
	}

}

package oca;

public class DM18 {
	public static void main(String[] args) {
		int a=2;
		switch(a) {
			case 1: //case "1": //error
				System.out.println("hello");
				break;
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

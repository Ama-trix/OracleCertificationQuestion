package oca;

public class ocatest25 {
	public static void main(String[] args) {
		for(int x=1;x<10;x++) {
			System.out.println("Hi");
			if(x==4)
			break;
			System.out.println("hello");
		}
		
		for(int x=1;x<4;x++) {
			System.out.println("Hi");
			if(x==2)
			continue;
			System.out.println("hello");
		}
	}

}

package oca;

public class OCATest28 {
	public static void main(String[] args) {
		for(int x=1;x<5;x++) {
			System.out.println("Hi");
			for(int y=1;y<3;y++) {
				System.out.println("Hello"+x+y);
			}
		}
		
		for(int x=1;x<3;x++) {
			System.out.println("Hi");
			for(int y=1;y<x;y++) {
				System.out.println("Hello"+x+y);
			}
		}
		
		
	}

}

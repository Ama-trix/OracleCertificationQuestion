package oca;

public class OCATest29 {
	public static void main(String[] args) {
		for(int x=1;x<5;x++) {
			System.out.println("Hi");
			for(int y=1;y<3;y++) {
				System.out.println("Hello");
				if(x==y) break;
				System.out.println("ok");
			}
		}
	}


}

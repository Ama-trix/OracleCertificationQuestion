package oca;

public class OCATest31 {
	public static void main(String[] args) {
		rahul:
		for(int x=1;x<5;x++) {
			System.out.println("Hi");
			ram:
			for(int y=1;y<3;y++) {
				System.out.println("Hello");
				if(x==y) continue ram;//continue ram;
				System.out.println("ok");
			}
		}
	}

}

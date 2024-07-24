package oca;

public class loop7 {
	
	public static void main(String[] args) {
		for(int x=1; x<=5; x++) {
			System.out.println("Ok");
			for(int y=1; ++y<=x++;)
				System.out.println("Hello");
		}
		System.out.println("Hi");
	}

}

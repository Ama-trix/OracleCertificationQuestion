package oca;

public class loop5 {
	public static void main(String[] args) {
		int y=3,x=1;
		for(x=1;x++<10;x++,y+=4) {
			while(x++<y)
				System.out.println("Hello");
		}
		System.out.println("Hi"+x+y);
	}



}

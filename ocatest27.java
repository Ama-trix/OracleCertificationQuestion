package oca;

public class ocatest27 {
	public static void main(String[] args) {
		int x=1;
		do {
			System.out.println("Hi");
			if(x==2)
			break;
			System.out.println("hello");
			x++;
		}while(x<5);
		
		int y=1;
		 do{
			System.out.println("Hi");
			if(y==2)
			continue;
			System.out.println("hello");
			y++;
		}while(y<4);
	}

}

package oca;

public class loop7a {
	public static void main(String[] args) {
	for(int x=1; x<=5; x++) {
		System.out.println("Ok");
		for(int y=x; y<=++x; y++, x++)
			System.out.println("Hello");
	}
	System.out.println("Hi");
}

}




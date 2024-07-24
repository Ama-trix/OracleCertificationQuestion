package oca;

public class OCATest52 {
	int x=10;
	static int y=23;
	OCATest52(int b){
		System.out.println("Hello");
		x+=b;
		y+=b;
	}
	OCATest52(){
		System.out.println("Hi");
	}
	void show() {
		System.out.println(x+y);
	}
	public static void main(String[] args) {
		new OCATest52(2).show();
		new OCATest52().show();
		new OCATest52(5).show();
	}


}

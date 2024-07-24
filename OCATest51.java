package oca;

public class OCATest51 {
	int x=10;
	static int y=23;
	OCATest51(int b){
		System.out.println("Hello");
		x+=b;
		y+=b;
	}
	void show() {
		System.out.println(x+y);
	}
	public static void main(String[] args) {
		new OCATest51(2).show();
		new OCATest51(5).show();
	}


}

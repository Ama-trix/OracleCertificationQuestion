package oca;

class JK{
	int x=10;
	static int y=23;
	static {
		System.out.println("Hi"+y++);
	}
	JK(){
		System.out.println("Hello"+y+++x++);
	}
	void show() {
		System.out.println(x+y);
	}
}
public class OCATest50 {
	public static void main(String[] args) {
		new JK().show();
		new JK().show();
	
	
	}
}

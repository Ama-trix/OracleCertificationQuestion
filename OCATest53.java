package oca;
public class OCATest53 {
	int x=10;
	OCATest53(){
		System.out.println("Hi");
		new OCATest53();
	}
	public static void main(String[] args) {
		new OCATest53();
	}
}
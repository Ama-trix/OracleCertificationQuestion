package oca;

class Myy {
	@Override
	public String toString() {
		return "Hello";
	}
}
class Mera {
	
}
public class ToStringEx {
	public static void main(String[] args) {
		Myy m=new Myy();
		System.out.println(m.toString());
		System.out.println(m);
		Mera m2=new Mera();
		System.out.println(m2.toString());
		System.out.println(m2);
	}


}

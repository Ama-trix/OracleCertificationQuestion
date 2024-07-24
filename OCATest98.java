package oca;

class Base {
	int i;
	Base() {
		m();
	}
	void m() {
		i =9;
	}
}
class Extension extends Base {
	Extension() {
	}
	void m() {
		i =7;
	}
}
public class OCATest98 {
	public static void main(String[] args) {
		Base b=new Extension();
		System.out.println(b.i);
	}


}

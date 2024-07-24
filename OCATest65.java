package oca;

class G{
	int x=90;
	static int y=40;
	static void mm() {
		System.out.println("Hello G");
	}
}
class H extends G{
	int x=89;
	static int y=30;
	void m2() {
		int x=70;
		int y=36;
		System.out.println(x);
		System.out.println(this.x);
		System.out.println(super.x);
		
		System.out.println(y);
		System.out.println(super.y);
		System.out.println(this.y);
		
		super.mm();
		this.mm();
		mm();
	}
	static void mm() {
		System.out.println("Hello H");
	}
	static void m() {
		int x=70;
		System.out.println(x);
		
		//System.out.println(super.y);//error
		//System.out.println(this.y);//error
		
		//System.out.println(this.x);//error
		//System.out.println(super.x);//error
	}
	static {
		int x=70;
		System.out.println(x);
		
		//System.out.println(super.y);//error
		//System.out.println(this.y);//error
		
		//System.out.println(this.x);//error
		//System.out.println(super.x);//error
	}
}
public class OCATest65 {
	public static void main(String[] args) {
		H h=new H();
		h.m2();
	}


}

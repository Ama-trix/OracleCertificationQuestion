package oca;

public class OCATest34 {
	int x=80;
	void mm() {
		int x=7;
		System.out.println(x);
	}
	
	static void m() {
		int x=9;
		System.out.println("hi");
		System.out.println(x);
		if(2<3) {
			//int x=980;//error
			System.out.println(x);
			int y=90;
			System.out.println(y);
		}
		int y=89;
		System.out.println(y);
	}
	public static void main(String[] args) {
		//mm();//error
		m();
		new OCATest34().mm();
		//System.out.println(x);//error
		System.out.println(new OCATest34().x);
	}

	

}

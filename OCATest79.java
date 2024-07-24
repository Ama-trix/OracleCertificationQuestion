package oca;

class UU {
	final void m1() {  System.out.println("UU m1");  }
	
	final static void m2() { System.out.println("UU m2");   }
	
}
public class OCATest79 extends UU{
	//void m1() {    }//error
	//int m1() {    }//error
	void m1(int x) {  System.out.println("GG m1");  }
	
	//static void m2() {    }//error
	
	private void m3() {System.out.println("GG m3"); }
	public static void main(String[] args) {
		UU u=new OCATest79();
		u.m1();
		u.m2();
		new OCATest79().m1();
		new OCATest79().m2();
	}

}

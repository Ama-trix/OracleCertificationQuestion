package oca;

class GHGHG{

	@Override
	protected void finalize() throws Throwable {
		System.out.println("hi");
	}
	
}
public class OCATest101 {
	public static void main(String[] args) {
		GHGHG g1=new GHGHG();
		GHGHG g2=new GHGHG();
		GHGHG g3=new GHGHG();
		GHGHG g4=new GHGHG();
		g1=null;
		g2=null;
		//System.gc();
		System.out.println("HELLO");
	}


}

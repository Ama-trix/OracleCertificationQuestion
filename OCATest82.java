package oca;
class JKJK{
	static int x=10;
	static {
		System.out.println("hello");
	}
}
class JKJKJKJK{
	final static int y=20;
	static {
		System.out.println("hi");
	}
}
class JKJKJKJKJKJKJK{
	final static int z;
	static {
		z=30;
		System.out.println("ok");
	}
}
public class OCATest82 {
	
	public static void main(String[] args) {
		System.out.println(JKJK.x);
		System.out.println(JKJKJKJK.y);
		System.out.println(JKJKJKJKJKJKJK.z);
	}
}

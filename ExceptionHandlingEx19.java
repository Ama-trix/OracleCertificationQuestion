package oca;

public class ExceptionHandlingEx19 {
	public static void main(String s[]) {
		try {
			System.out.println("hi");
			System.out.println(7/0);
		}catch (Exception e) {
			System.out.println("hello");
			m3();
			System.out.println("hello2");
		}finally {
			System.out.println("ok");
			System.out.println(9/0);
			//m3();
			System.out.println("incapp");
		}
	}
	static void m3() throws Exception{
		throw new Exception();
	}
}

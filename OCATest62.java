package oca;

class QQ{
	QQ(){ 
		System.out.println("QQ");
	}
	QQ(int a){ this();
		System.out.println("QQ int");
	}
	{
		System.out.println("Hi QQ");
	}
	static {
		System.out.println("Hello QQ");
	}
}
class PP extends QQ{
	PP(int a){ 
		System.out.println("PP int");
	}
	{
		System.out.println("Hi PP");
	}
	static {
		System.out.println("Hello PP");
	}
}
public class OCATest62 {
	public static void main(String[] args) {
		new PP(4);
	}


}

package oca;

class QQQ{
	QQQ(){ 
		System.out.println("QQ");
	}
	QQQ(int a){ this();
		System.out.println("QQ int");
	}
	{
		System.out.println("Hi QQ");
	}
	static {
		System.out.println("Hello QQ");
	}
}
class PPP extends QQQ{
	PPP(int a){ this();
		System.out.println("PP int");
	}
	PPP(){ super(3);
		System.out.println("PP");
	}
	{
		System.out.println("Hi PP");
	}
	static {
		System.out.println("Hello PP");
	}
}
public class OCATest64 {
	public static void main(String[] args) {
		new PPP(4);
	}


}

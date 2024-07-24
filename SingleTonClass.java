package oca;

class SingleTon{
	int g=10;
	private SingleTon(){
		System.out.println("Object Created");
	}
	static private SingleTon s=new SingleTon();
	static SingleTon getObj() {
		return s;
	}
}
public class SingleTonClass {

	public static void main(String[] args) {
		SingleTon s1=SingleTon.getObj();
		SingleTon s2=SingleTon.getObj();
		s1.g=70;
		System.out.println(s1.g);
		System.out.println(s2.g);
	}
}

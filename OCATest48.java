package oca;

public class OCATest48 {
	static String rr="yoyo";
	String x="kk";
	void mm(String a,String b) {
		rr=b;
		a+="hh";
		x=a;
	}
	public static void main(String[] args) {
		OCATest48 o1=new OCATest48();
		OCATest48 o2=new OCATest48();
		o1.mm("foo","faa");
		System.out.println(o1.x+o1.rr);
		o1.mm("xyz","abc");
		o2.mm("pqr","mno");
		System.out.println(o1.x+o1.rr);
		System.out.println(o2.x+o2.rr);
		System.out.println(new OCATest48().rr);
	}


}

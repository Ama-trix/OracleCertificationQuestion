package oca;

class K{
	void m1() {
		System.out.println("Hello K");
	}
}
public class AnonymousNestedClassEx {
	public static void main(String[] args) {

		K k=new K() {
			void m1() {
				System.out.println("ghj jgjfgjdgfjfd");
			}
		};
		k.m1();
		
		K k2=new K() {
			void m2() {
				System.out.println("ghj jgjfgjdgfjfd");
			}
		};
		//k2.m2();//error
	}
}

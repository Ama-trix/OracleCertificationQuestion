package oca;
class A{
}
class B{
}
class X extends A{
}
class Y extends X{
}
public class InstanceOfExample {
	public static void main(String[] args) {
		A ram=new X();
		X mohan=new X();
		System.out.println(ram instanceof A); //true
		System.out.println(mohan instanceof A); //true
		System.out.println(mohan instanceof X); //true
		System.out.println(ram instanceof X); //true
		
		System.out.println(ram instanceof Y); //false
		System.out.println(mohan instanceof Y); //false
		//System.out.println(ram instanceof B);//error
	}
}

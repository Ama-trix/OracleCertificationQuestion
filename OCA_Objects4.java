package oca;

class Salty{
	int a=10;
	Salty g;
	Salty(Salty g){
		this.g=g;
		g.a+=45;
		this.a+=10;
	}
	Salty(){
		System.out.println("Hello");
	}
	Salty gg() {
		return g.g;
	}
}
public class OCA_Objects4 {
	public static void main(String[] args) {
		Salty g=new Salty();
		g.a+=20;
		Salty gg=new Salty(g);
		Salty ggg=gg.gg();
		System.out.println(gg.a);
		System.out.println(g.a);
		System.out.println(ggg.a);
	}


}

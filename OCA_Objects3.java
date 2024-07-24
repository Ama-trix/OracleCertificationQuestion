package oca;
class Salt{
	int a=10;
	Salt(Salt g){
		g.a+=45;
		this.a+=10;
	}
	Salt(){
		System.out.println("Hello");
	}
}
public class OCA_Objects3 {
	public static void main(String[] args) {
		Salt g=new Salt();
		g.a+=20;
		Salt gg=new Salt(g);
		System.out.println(gg.a);
		System.out.println(g.a);
	}


}

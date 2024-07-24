package oca;

class GGG{
	GGG(){ this(45);
		System.out.println("GGG");
	}
	GGG(int a){ this("yy",67);
		System.out.println("GGG int");
	}
	GGG(String a){ this();
		System.out.println("GGG String");
	}
	GGG(int a,String b){ //this();  
		//this(3,"pp");//error
		System.out.println("GGG int String");
		//this();//error
	}
	GGG(String a,int b){
		System.out.println("GGG String int");
	}
}
public class OCATest60 {
	public static void main(String[] args) {
		//new GGG();
		//new GGG(4);
		new GGG("ho");
		//new GGG(3,"kk");
		//new GGG("kk",3);
		//new GGG(3,"k");
	}


}

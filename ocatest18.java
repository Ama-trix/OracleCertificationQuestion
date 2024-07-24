package oca;

public class ocatest18 {
	public static void main(String[] args) {
		//infinite loop
//		for(;;){
//			System.out.println("hi");
//		}
		//infinite loop
//		for(int x=1;;x++){
//			System.out.println("hi");
//		}
	//error	//for(int x=1;;int y=9);
		
		//infinite loop
//		for(int x=1;x<10;x=2)
//			System.out.println("hi");
		
		//infinite loop
//		for(int x=1;x<10;x=2)
//			System.out.println("hi"+ ++x);
		
		for(int x=1;x<10;x+=2)
		System.out.println("hi"+ ++x);
		
		for(int x=1;x<10;x+=2)
		System.out.println("hi"+ ++x);
		//System.out.println("hi"+ ++x);//error
		
		int x;
		for(x=1;x<10;x+=x++)
		System.out.println("hi"+ ++x);
		System.out.println(x);
		
	}
}

package oca;

public class OCATest85 {
	public static void main(String[]args) {
		short x=9;
		int y=9;
		
		int a[]= {3,56,7,'h',(byte)8,x,y};
		double b[]= {4,6,'j',8.0,(byte)8,x,y};
		//String c[]= {"hi",3};//error
		//String c[]= {"hi",'h'};//error
		String c[]= {"hi","h","3"};
		//char d[]= {104,3434,'h',65};//allowed
		//char d[]= {x};//error
		//char d[]= {y};//error
		
		int q[]= {9,4};
		//double p[]=q;//error
		//double p[]=(double[])q;//error
	}


}

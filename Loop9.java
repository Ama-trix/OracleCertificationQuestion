package oca;

public class Loop9 {
	public static void main(String[] args) {
		int x=1;
		abc:
			while(x++<5) {
				System.out.println("kk");
				x:
					for(int i=1; i<=5; i++) {
						System.out.println("oo");
						if (i==2)
							break abc;
						else
							continue x;
					}
			 System.out.println("Incapp");
					}
		System.out.println("Hi");
	}

}

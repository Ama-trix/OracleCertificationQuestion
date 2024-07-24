package oca;

public class OCATest107 {
	public static void main(String[] args) {
		Integer a1=Integer.decode("104");
		Integer a2=Integer.decode("0x68");
		Integer a3=Integer.decode("0150");
		//Integer a3=Integer.decode("0b1100");//java.lang.NumberFormatException: For input string: "b1100"
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);
		Integer a4=Integer.valueOf(12);
		Integer a5=Integer.valueOf("12");
		//Integer a5=Integer.valueOf("0x68");//java.lang.NumberFormatException: For input string: "b1100"
		System.out.println(a4);
		System.out.println(a5);

		int a6=Integer.parseInt("12");
		//int a6=Integer.parseInt(12);//error
		System.out.println(a6);
	}
}
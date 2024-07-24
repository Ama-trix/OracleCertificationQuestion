package oca;

public class StringEx6 {
	public static void main(String[] args) {
		//StringBuilder s="Hi";//error [double quotes data is by-default String class object not StringBuilder or StringBuffer class object]
		//StringBuilder s=new StringBuilder("Hi Incapp");//java-5(methods NOT synchronized)
		StringBuffer s=new StringBuffer("Hi Incapp");//java-1(methods synchronized)
        System.out.println(s);
		s.append("rahul");
		System.out.println(s);
		s.append(12);
		System.out.println(s);
		s.insert(2, "incapp");
		System.out.println(s);
		s.reverse();
		System.out.println(s);
		s.replace(2,8,"india");
		System.out.println(s);
		s.delete(2,8);
		System.out.println(s);
		
        //coversion from String -> StringBuilder and StringBuilder -> String
        String a="I love my INDIA";
        StringBuilder b=new StringBuilder(a);
        String c=b.toString();
	}



}

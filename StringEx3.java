package oca;

public class StringEx3 {
	public static void main(String[] args) {
		String s1=new String("rahul");
        String s2="rahul";
        String s3=new String("rahul");
        String s4="rahul";
        String s5=new String("rahul");
        String s6="rahul";
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
        System.out.println(s5);
        System.out.println(s6);
        System.out.println(s1==s3);//false: compare the reference 
        System.out.println(s2==s4);//true: compare the reference
        System.out.println(s1.equals(s3));//true: compare the data
        System.out.println(s2.equals(s4));//true: compare the data
        s1=null;
        s2=null;
	}
}

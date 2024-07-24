package oca;
import java.util.ArrayList;
public class OCATest94 {
	public static void main(String[]args) {
		//List<String> a=new ArrayList();
		//ArrayList<String> a=new ArrayList();
		//ArrayList<String> a=new ArrayList<String>();
		ArrayList<String> a=new ArrayList<>();
		//ArrayList<> a=new ArrayList();//error
		a.add("ram");
		//a.add(12);//error
		a.add("12");
		a.add("3.2");
		System.out.println(a);
		for(String s:a) {
			System.out.println(s);
		}
		String s1=a.get(0);
		System.out.println(s1);
		

		ArrayList<Integer> b=new ArrayList<>();
		//ArrayList<int> b=new ArrayList<>();//error
		b.add(12);
		b.add(23);
		for(int s:b) {
			System.out.println(s);
		}
	}

}

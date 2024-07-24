package oca;

import java.util.ArrayList;
import java.util.Iterator;

public class OCATest90 {
	public static void main(String[]args) {
		//ArrayList a=new ArrayList();//by-default initial capacity: 10
		ArrayList a=new ArrayList(20);//initial capacity: 20
		a.add("ram");
		a.add(12);
		a.add(12);
		a.add(3.2);
		System.out.println(a);
		for(Object o:a) {
			System.out.println(o);
		}
		Iterator i=a.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		//String s=a[0];//error
		//String s=a.get(0);//error
		String s1=(String)a.get(0);
		System.out.println(s1);
		//String s2=(String)a.get(1);//ClassCastException
		int s2=(int)a.get(1);
		System.out.println(s2);
		Integer s3=(Integer)a.get(1);
		System.out.println(s3);
		//Double s4=(Double)a.get(1);//ClassCastException

		double s5=(int)a.get(1);
		System.out.println(s5);
		
		Object o=a.get(1);
		System.out.println(o);
	}

}

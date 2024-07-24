package oca;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class OCATest95 {
	public static void main(String[]args) {
		ArrayList a=new ArrayList();
		a.add("ram");
		a.add(12);
		a.add(12);
		a.add(3.2);
		ArrayList b=new ArrayList();
		b.add("kk");
		b.add("yy");
		b.add(12);
		b.add(1,"tina");
		b.set(3,"Heera");
		b.addAll(a);
		b.addAll(2,a);
		System.out.println(b.size());
		//b.clear();
		System.out.println(b);
		System.out.println(b.contains(12));//true
		System.out.println(b.get(2));//if index does not exist then, java.lang.IndexOutOfBoundsException occured
		System.out.println(b.indexOf("ram"));
		System.out.println(b.isEmpty());
		System.out.println(b.indexOf(12));
		System.out.println(b.lastIndexOf(12));
		System.out.println(b.remove(2));//return type is Object (remove and return the element which is removed).
		System.out.println(b);
		System.out.println(b.remove("ram"));//return type is boolean 
		System.out.println(b.remove((Integer)12));//return type is boolean
		System.out.println(b);
		//System.out.println(b.removeAll(a));//return type is boolean 
		System.out.println(b.retainAll(a));//return type is boolean 
		System.out.println(b);
		
		List l=b.subList(2, 5);
		//ArrayList l=b.subList(2, 5);//error
		//ArrayList l=(ArrayList)b.subList(2, 5);//java.lang.ClassCastException
		System.out.println(l);
		
		Object o[]=a.toArray();
		System.out.println(Arrays.toString(o));
		
		ArrayList<String> aa=new ArrayList();
		aa.add("ram");
		aa.add("mohan");
		aa.add("sohan");
		Object oo[]=aa.toArray();
		//String oo[]=(String[])aa.toArray();//java.lang.ClassCastException
		//String oo[]=aa.toArray();//error
		System.out.println(Arrays.toString(oo));
	}

}

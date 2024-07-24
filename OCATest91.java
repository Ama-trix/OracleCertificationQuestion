package oca;

import java.util.ArrayList;
import java.util.Iterator;

public class OCATest91 {
	public static void main(String[]args) {
		ArrayList a=new ArrayList();
		a.add("ram");
		a.add(12);
		a.add(12);
		a.add(3.2);
		Iterator i=a.iterator();
		System.out.println(i.next());
		System.out.println(i.next());
		System.out.println(i.next());
		System.out.println(i.next());
		System.out.println(i.next());//NoSuchElementException
	}


}

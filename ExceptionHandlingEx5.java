package oca;

import java.io.*;

public class ExceptionHandlingEx5 {
	public static void main(String[] args) {
		System.out.println("Hello");
		try {
			FileInputStream f=new FileInputStream("xyz.txt");
		}catch(FileNotFoundException ae) {
			System.out.println(ae);
		}
		System.out.println("Bye");
	}


}

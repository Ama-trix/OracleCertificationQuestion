package oca;

public class DM19 {
	public static void main(String[] args) {
		switch("hello") {
				case "1": //case 1: //error
				System.out.println("hello");
				break;
			case "hello":{
				System.out.println("Hi");
				break;
			}
			case "ram":
				System.out.println("ok");
		}
		System.out.println("bye");
	}

}

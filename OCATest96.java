package oca;

public class OCATest96 {
	public static void main(String[]args) {
		//java.lang.Math
		System.out.println(Math.max(23,45));//45
		//System.out.println(Math.max(23,45,55,2,5,25,58));//error [only two args]
		System.out.println(Math.min(23,45));//23
		System.out.println(Math.round(45.50));//46
		System.out.println(Math.round(45.49));//45
		System.out.println(Math.ceil(45.1));//46.0
		System.out.println(Math.floor(45.9));//45.0
		System.out.println(Math.pow(2, 5));//32.0
		System.out.println(Math.random());//random number (double type) between 0-1
		System.out.println(Math.sqrt(2));//1.4142135623730951
		System.out.println(Math.cbrt(2));//1.2599210498948732
		System.out.println(Math.abs(6.2));//6.2
		System.out.println(Math.abs(-6.2));//6.2
		System.out.println(Math.abs(6));//6
		System.out.println(Math.abs(-6));//6
	}

}

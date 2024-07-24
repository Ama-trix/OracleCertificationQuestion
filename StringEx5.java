package oca;

public class StringEx5 {

	public static void main(String[] args) {
		String s1 = "Rahul Chauhan";
        String s2 = "Rajput";
        char c[]=s1.toCharArray();
        for (char ch : c)
        		System.out.print(ch);

        for (Character ch : s1.toCharArray())
        		System.out.print(ch);
        
        System.out.println(s1.toUpperCase());
        System.out.println(s1.toLowerCase());
        System.out.println(s1.charAt(2));
        System.out.println(s1.concat(s2));
        System.out.println(s1+s2);
        for (int x = 0; x < s1.length(); x++) {
            System.out.println(s1.charAt(x));
        }
        System.out.println(s1.substring(2));
        System.out.println(s1.substring(2, 8));
        System.out.println(s1.indexOf('h'));
        System.out.println(s1.indexOf('h', 3));
        System.out.println(s1.indexOf('k'));
        System.out.println(s1.lastIndexOf('h'));
        System.out.println(s1.indexOf("Chauhan"));
        System.out.println("  ram  kumar  ".trim());
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals("Rahul Chauhan"));
        System.out.println(s1.equals("Rahul chauhan"));
        System.out.println(s1.equalsIgnoreCase("Rahul chauhan"));
        System.out.println(s1.equalsIgnoreCase(s2));
        
        System.out.println(s1.compareTo(s2));//return int [ difference of ASCII codes]
        System.out.println("Hi".compareTo("Hi"));//0
        System.out.println("Hello".compareTo("Hi"));//-4
        System.out.println("Hi".compareTo("Hello"));//4
        System.out.println("He".compareTo("Hello"));//-3 [second string has 3 more characters]
        System.out.println("Hello".compareTo("He"));//3 [first string has 3 more characters]
        
	}


}

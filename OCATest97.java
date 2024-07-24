package oca;

import java.util.Arrays;
import java.util.Random;

public class OCATest97 {
	public static void main(String[] args) {
		Random random = new Random();
		//Random r = new Random(10);//allowed //same as above
		System.out.println(random.nextInt(10));//return random int form 0 to 10
		System.out.println(random.nextInt());//return random int range [-ve or +ve]
		System.out.println(random.nextLong());//return random long range [-ve or +ve]
		System.out.println(random.nextBoolean());//return random boolean 
		System.out.println(random.nextDouble());//return random double range from 0.0 to 1.0
		System.out.println(random.nextFloat());//return random float range from 0.0 to 1.0
		System.out.println(random.nextGaussian());//return random double near to 0.0 or 1.0 [-ve or +ve]
		byte[] b = new byte[10];
		random.nextBytes(b);//return 10 any byte numbers [-ve or +ve]
		System.out.println(Arrays.toString(b)); 

		System.out.println("Sum of all the elements in the IntStream returned = " +random.ints().count()); 
		System.out.println("Count of all the elements in the DoubleStream returned = " +random.doubles().count());
		System.out.println("Count of all the elements in the LongStream returned = "+random.longs().count());
	}

}

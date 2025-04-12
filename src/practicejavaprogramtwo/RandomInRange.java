package practicejavaprogramtwo;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class RandomInRange {
	public static void main(String[] args) {
		double number=Math.random();
		int range=100;
		
		System.out.println(number*range);
		
		
		System.out.println("************Another way***************");
		
		System.out.println(Math.random());
		System.out.println(ThreadLocalRandom.current().nextInt());
		System.out.println(ThreadLocalRandom.current().nextDouble());
		System.out.println(ThreadLocalRandom.current().nextBoolean());
		
		Random random=new Random();
		
		System.out.println(random.nextInt(10));
		System.out.println(random.nextDouble(10000));
		System.out.println(random.nextLong(1000));
		
		
		
	}

}

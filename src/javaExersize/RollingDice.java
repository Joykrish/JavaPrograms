package javaExersize;

import java.util.Random;

public class RollingDice {
	
	public static void main(String[] args) {
		Random r=new Random();
		int random=r.nextInt(6) +1;
		System.out.println("you rolled at "+random);
		
	}

}

package singletonpattern;

public class TestFour {
	public static void main(String[] args) {
		SingleTonEgarinitialization sc1=SingleTonEgarinitialization.getInstance();
		SingleTonEgarinitialization sc2=SingleTonEgarinitialization.getInstance();
		sc1.show();
		sc2.show();
		System.out.println(sc1==sc2);
	}
	
	

}

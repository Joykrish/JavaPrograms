package singletonpattern;

public class TestTwo {
public static void main(String[] args) {
	SingleTonPattern ob1=SingleTonPattern.getInstance();
	SingleTonPattern ob2=SingleTonPattern.getInstance();
	ob1.showMessage();
	ob2.showMessage();
	System.out.println(ob1==ob2);
}
}

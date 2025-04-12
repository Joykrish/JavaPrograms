package singletonpattern;

public class TestThree {
public static void main(String[] args) {
	SingletonDoubleCheckedLocking ob1=SingletonDoubleCheckedLocking.getInstance();
	SingletonDoubleCheckedLocking ob2=SingletonDoubleCheckedLocking.getInstance();
	
	ob1.showMessage();
	ob2.showMessage();
	boolean test=(ob1==ob2);
	System.out.println(test);
	
}
}

package javaExersize;

public class ReminderWithoutusingOperator {

	public static void main(String[] args) {
		int a=99;
		int b=4;
		int multiply=1;
		int i=1;
		while((multiply+b)<a) {
			
			multiply=b*i;
			i++;
		
		}
		int reminder=a-multiply;
		System.out.println("reminder is "+reminder);
	}
}

package javaExersize;

public class ArmstrongNumber {
public static void main(String[] args) {
	int num=1634;
	int newnumber=num;
	int number=0;
	
	while(num>0) {
		int reminder=num%10;
		number=number+(reminder*reminder*reminder*reminder);
		num=num/10;
	}
	System.out.println(number);
	if(number==newnumber) {
		System.out.println("Armstrong number");
	}
	else {
		System.out.println("Not armstrong");
	}
}
}

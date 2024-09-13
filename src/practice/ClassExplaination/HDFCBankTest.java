package practice.ClassExplaination;

import java.util.Scanner;

class HDFC{
	private int customerID;
	public String customerName;
	float balance=100000.5f;
	public  void withDraw(float amountWithdraw) {
		balance=balance-amountWithdraw;
		System.out.println("Balance is"+balance);
	}
	public void deposit(float amountDeposit) {
		balance=balance+amountDeposit;
		System.out.println("Balance is"+balance);
	}
}

class HDFCMumbai extends HDFC{
	
}

public class HDFCBankTest {
	public static void main(String[] args) {
		HDFC obj=new HDFC();
		System.out.println("Welcome to HDFC bank");
		System.out.println("Please press 1 for  withdraw:\npresss 2 for Deposit:\npresss 3 to add nominees:\nPlease press 5 for exit");
		
		Scanner sc=new Scanner(System.in);
		int choice=sc.nextInt();
		System.out.println("Thank you!!!You have choosen here"+choice);
		
		if(choice==1) {
			
			System.out.println("Please enter the amount you want to withdraw");
			float amount=sc.nextFloat();
			obj.withDraw(amount);
		}
		else if(choice==2) {
			System.out.println("Please enter the amount you want to Deposit");
			float amount=sc.nextFloat();
			obj.deposit(amount);
		}
		
		else if(choice==5) {
			System.out.println("Thank you for using HDFC bank services::");
		}
		
		
		
		
	}

}

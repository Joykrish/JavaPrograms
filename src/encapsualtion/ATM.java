package encapsualtion;

public class ATM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EnCapTest en=new EnCapTest();
		
		
		en.updatePin(123456, 1234, 1114);
		en.withDrawone(123456,1114, 1000);
		System.out.println(en.depositCash(123456, 1114, 2000));

	}

}

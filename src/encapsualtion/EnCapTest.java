package encapsualtion;

public class EnCapTest {

	public int accountNumber = 123456;
	private int pinNum = 1234;
	private int Totalbalance = 10000;

	public void withDrawone(int acNumber, int pinNumber, int amount) {

		if (acNumber == accountNumber && pinNumber == pinNum) {

			if (amount < Totalbalance) {

				Totalbalance = Totalbalance - amount;
				System.out.println("Withdrawal: " + amount);
			} else {
				System.out.println("InSufficient Balance");
			}
		} else {
			System.out.println("Invalid Credentials");
		}

	}

	public void updatePin(int accNum, int oldPin, int NewPin) {

		if (accNum == accountNumber && oldPin == pinNum) {
			pinNum = NewPin;
			System.out.println("new pint is: " + pinNum);
		} else {
			System.out.println("Invalid old pin");
		}

	}

	public int depositCash(int accNumber, int pin, int amount) {
		if (accNumber == accountNumber && pin == pinNum) {
			Totalbalance = Totalbalance + amount;
			return Totalbalance;
		} else {
			System.out.println("Invalid Credentials");
			return Totalbalance;
		}
	}

}

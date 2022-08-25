package Week3Day1;

public class AxisBank extends BankInfo {

	public void deposit(int a) {
		System.out.println("Deposit amount is " +a);
	}
	
	public static void main(String[] args) {
		
		AxisBank a1 = new AxisBank();
		a1.saving();
		a1.fixed();
		a1.deposit();
		a1.deposit(20000);
	}
}

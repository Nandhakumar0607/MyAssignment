package homework.day5;

public class AxisBank extends BankInfo {

	@Override
	public void Deposit() {
		// TODO Auto-generated method stub
		super.Deposit();
		System.out.println("This is Over Raided Deposit Account");
	}
	
	public static void main(String[] args) {
		AxisBank s1 = new AxisBank();
		s1.Savings();
		s1.fixed();
		s1.Deposit();
	}
}

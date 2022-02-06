package week3.day1;

public class AxisBank extends BankInfo{
	public void deposit() {
		System.out.println("this is deposit  method from axis bank class");
		
	}
	
	public static void main(String[] args) {
		AxisBank ab=new AxisBank();
		ab.deposit();
		BankInfo bi=new BankInfo();
		bi.deposit();
	}

}

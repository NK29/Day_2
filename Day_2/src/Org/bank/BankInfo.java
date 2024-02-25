package Org.bank;

public class BankInfo extends AxisBank{
	
	public void saving() {
		System.out.println("Saving: 6500");
	}
	public void fixed() {
		System.out.println("Fixed: 2500");
	}

	public static void main(String[] args) {
		
		BankInfo bankinfo = new BankInfo();
		bankinfo.saving();
		bankinfo.fixed();
		bankinfo.deposit();
	}

}

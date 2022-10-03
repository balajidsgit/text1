package org.bank;

public class BankInfo extends AxisBank {
	public void saving() {
		System.out.println("Savings interest: 12%");
	}
	public void fixed() {
		System.out.println("Fixed Interest: 7%");
	}
	public static void main(String[] args) {
		BankInfo b = new BankInfo();
		b.saving();
		b.fixed();
		b.deposit();
	}

}

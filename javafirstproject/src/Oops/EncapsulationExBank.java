package Oops;
class BankAccount {
	private double balance;
	private int accountNumber;
	private String ownerName;
	public void deposit (double amount) {
		// balance += amount;
		balance =balance+ amount;
	}
	public BankAccount (double balance, int accountNumber, String ownerName) {
		this.balance= balance;
		this.accountNumber= accountNumber;
		this.ownerName =ownerName;	
	}
    public double withdraw(double amount) {
    	// check if the balance is sufficient for the withdrawal
    	if (balance < amount) {
    		System.out.println("In sufficient balance");
    		return 0; // return 0 if not sufficient
    	}
    	balance -= amount;
    	return amount;// return the amount withdrawn
    }
    public double getBalance() {
    	return balance;
    }
}
public class EncapsulationExBank {
	public static void main(String[] args) {
		BankAccount ba = new BankAccount (15000, 104, "Befiii");
		System.out.println(ba.getBalance());
		ba.deposit (7000);
		System.out.println(ba.getBalance());
		ba.withdraw (4000);
		System.out.println("After withdrawb:"+ba.getBalance());
	    System.out.println("After Withdraw:"+ba.getBalance());

	}
}
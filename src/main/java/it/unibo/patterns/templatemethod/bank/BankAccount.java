package it.unibo.patterns.templatemethod.bank;

public abstract class BankAccount {
	private int amount;
	
	public BankAccount(int amount){
		this.amount = amount;
	}
	
	public abstract int operationFee(); // costo bancario operazione
	
	public int getAmount(){
		return this.amount;
	}
	
	public void withdraw(int n){	// template method
		this.amount = this.amount - n - this.operationFee();
	}

	public static void main(String[] args){
		final BankAccount b = new BankAccountWithConstantFee(100);
		b.withdraw(20);
		System.out.println(b.getAmount()); // 79
	}
}

class BankAccountWithConstantFee extends BankAccount {
	public BankAccountWithConstantFee(int amount) {
		super(amount);
	}

	public int operationFee(){ return 1; }	
}
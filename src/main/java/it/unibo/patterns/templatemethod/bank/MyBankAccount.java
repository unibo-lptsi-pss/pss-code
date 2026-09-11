package it.unibo.patterns.templatemethod.bank;
import java.io.IO;

public class MyBankAccount {
	private int amount;
	private OperationFeeStrategy strategy;
	
	public MyBankAccount(int amount, OperationFeeStrategy strategy){
		this.amount = amount;
		this.strategy = strategy;
	}
	
	public int getAmount(){
		return this.amount;
	}
	
	public void withdraw(int n){	// template method
		this.amount = this.amount - n - this.strategy.operationFee(n);
	}
	// main di prova
	public static void main(String[] args){
		MyBankAccount b = new MyBankAccount(100,n->n<10?0:1);
		b.withdraw(20);
		IO.println(b.getAmount());// 79
	}
}

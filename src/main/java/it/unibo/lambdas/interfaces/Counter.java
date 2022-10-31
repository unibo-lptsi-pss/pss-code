package it.unibo.lambdas.interfaces;

public class Counter {
	private int count;
	
	public Counter(){
	    this.count = 0;
	}
	
	public void inc(){
		this.count++;
	}
		
	public int getValue(){
	    return this.count;
	}
}

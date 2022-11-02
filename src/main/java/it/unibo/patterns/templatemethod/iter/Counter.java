package it.unibo.patterns.templatemethod.iter;

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

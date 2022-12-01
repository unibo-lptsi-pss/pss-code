package it.unibo.guis.swing.mvc.model;

public interface DrawNumber {
	
	void reset();
	
	DrawResult attempt(int n) throws AttemptsLimitReachedException;
}

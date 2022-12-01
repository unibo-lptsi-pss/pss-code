package it.unibo.guis.swing.mvc.view;

public interface DrawNumberViewObserver {	
	void newAttempt(int n);
	
	void resetGame();
	
	void quit();
}

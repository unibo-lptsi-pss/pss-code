package it.unibo.guis.swing.mvc.view;

import it.unibo.guis.swing.mvc.model.DrawResult;

public interface DrawNumberView {
	void setObserver(DrawNumberViewObserver observer);

	void start();

	void numberIncorrect();

	void limitsReached();

	void result(DrawResult res);
}

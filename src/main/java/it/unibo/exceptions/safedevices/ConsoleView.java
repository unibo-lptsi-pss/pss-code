package it.unibo.exceptions.safedevices;

import java.io.*;
import java.io.IO;

/**
 * This class provides an implementation of the View simply using the console
 */
public class ConsoleView implements View {
	private static final String CLEAR_CONSOLE = "\033[2J\033[;H";
	private static final BufferedReader KBD = 
			new BufferedReader(new InputStreamReader(System.in));
	
	private String rowString;
	private String logString;
	
	public ConsoleView() {
		this.rowString = "";
		this.logString = "";
	}

	public void redraw() {
		System.out.print(CLEAR_CONSOLE);
		IO.println(this.rowString);
		IO.println(this.logString);
	}

	public void setRowStatus(final String s) {
		this.rowString = s;
	}

	public void setLogString(final String s) {
		this.logString = s;
	}

	public String ask(final String question){
		System.out.print(question); // Asking message
		try{
			return KBD.readLine();
		} catch (IOException e){
			return null;
		} 
	}
}

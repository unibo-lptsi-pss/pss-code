package it.unibo.guis.swing;

import java.awt.*;
import javax.swing.*;

public class UseButtonEvents3 {
	public static void main(String[] args) {
		final JButton b1 = new JButton("Say Hello");
		b1.addActionListener(e -> System.out.println("Hello!!")); 

		final JButton b2 = new JButton("Quit");
		b2.addActionListener(e -> {
			System.out.println("Quitting..");
			System.exit(0);
		});

		final MyFrame frame = new MyFrame("Events Example", new FlowLayout());
		frame.getMainPanel().add(b1);
		frame.getMainPanel().add(b2);
		frame.setVisible(true);
	}
}

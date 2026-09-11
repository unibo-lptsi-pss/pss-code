package it.unibo.lambdas.first;

import java.awt.FlowLayout;
import java.io.IO;

import javax.swing.*;

public class UseButtonEventsWithLambda {
	public static void main(String[] args) {
		final JButton b1 = new JButton("Say Hello");
		// lambda con single-expression body
		b1.addActionListener( e -> IO.println("Hello!!"+e));
		
		final JButton b2 = new JButton("Quit");
		// lambda con body
		b2.addActionListener( e -> { 
			IO.println("Quitting.."+e);
			System.exit(0);
		});
		
		final JFrame frame = new JFrame("Events Example");
		frame.setSize(320, 200);
		frame.getContentPane().setLayout(new FlowLayout());
		frame.getContentPane().add(b1);
		frame.getContentPane().add(b2);
		frame.setVisible(true);
	}
}

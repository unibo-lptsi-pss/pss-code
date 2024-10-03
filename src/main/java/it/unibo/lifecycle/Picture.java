package it.unibo.lifecycle;

import java.awt.image.*;
import java.awt.*;
import javax.swing.*;

public class Picture {
	
	BufferedImage canvas = null;
	JFrame mainFrame = null;
	
	Picture(int width, int height){
		mainFrame = new JFrame("Mandelbrot Set"){
			@Override
		    public void paint(Graphics g) {
		        g.drawImage(canvas, 0, 0, this);
		    }
		};
        mainFrame.setSize(width, height);
        mainFrame.setResizable(false);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        canvas = new BufferedImage(mainFrame.getWidth(), mainFrame.getHeight(), BufferedImage.TYPE_INT_RGB);
        mainFrame.setVisible(true);
	}
	
	void drawPixel(int x, int y, int color){
		canvas.setRGB(x, y, color);
		mainFrame.repaint();
	}

}

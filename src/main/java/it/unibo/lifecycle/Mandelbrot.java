package it.unibo.lifecycle;

public class Mandelbrot {
	static final double MAX_PRODUCT = 4.0;
	int width, height, x, y; // uno per linea di norma
	double minx, maxx, miny, maxy, maxIter; // uno per linea di norma

	Mandelbrot(int w, int h, double minx, double maxx, double miny, double maxy,
			int maxIter) {
		this.width = w;	this.height = h;
		this.minx = minx;	this.maxx = maxx; this.miny = miny;	this.maxy = maxy;
		this.maxIter = maxIter;
	}
	void advancePosition(){
		// avanza orizzontalmente
		x = (x + 1) % width;
		// quando abbiamo finito la riga, avanziamo verticalmente
		y = y + (x == 0 ? 1 : 0);
	}
	// abbiamo finito quando abbiamo disegnato tutte le righe
	boolean isCompleted(){ return y == height; }
	int computeIterations(){
		Complex c0 = new Complex(this.minx + (this.maxx - this.minx) * x / width,
			this.miny + (this.maxy - this.miny) * y / height);
		Complex c = c0;
		int iter;
		for (iter = 0; 
			c.getScalarProduct() < MAX_PRODUCT && iter < this.maxIter; 
			iter++) {
			c = c.times(c).sum(c0); // c = c*c + c0
		}
		return iter;
	}
}

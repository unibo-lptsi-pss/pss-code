package it.unibo.structured;

import java.util.Arrays;
import java.io.IO;

public class UseMath { // E' una utility class
	// Metodo statico, crea e torna un array di double
	// lungo size, contenente numeri random 0<=x<=1
	static double[] randomValues(int size){
		double[] d = new double[size];
		for (int i = 0; i < size; i++){
			d[i] = Math.random();
		}
		return d;
	}

	public static void main(String[] args) {
		IO.println(Math.random());

		// Ricorda: toString è un metodo statico della classe Arrays
		IO.println(Arrays.toString(randomValues(10)));

		for (double x = 0.0; x <= Math.PI * 2; x = x + Math.PI / 10){
			IO.println("x = " + x + "\t sin(x) = " + Math.sin(x));
		}
	}
}

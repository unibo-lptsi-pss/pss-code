package it.unibo.lifecycle;

class Point3DBis { // dichiarazione classe
	double x; // 3 campi
	double y;
	double z;

	Point3DBis build(double a, double b, double c) { // build con ritorno
		this.x = a;
		this.y = b;
		this.z = c;
		return this;
	}

	double getModule() { 
		return this.x * this.x + this.y * this.y + this.z * this.z;
	}

	static Point3DBis ZERO = new Point3DBis().build(0, 0, 0);

	static Point3DBis max(Point3DBis[] ps) { // metodo statico
		Point3DBis max = ZERO; // ricerca max
		for (Point3DBis elem : ps) {
			if (elem.getModule() > max.getModule()) {
				max = elem;
			}
		}
		return max;
	}
}
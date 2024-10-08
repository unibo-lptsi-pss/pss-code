package it.unibo.lifecycle.points;

class Point3D { // dichiarazione classe
	double x; // 3 campi
	double y;
	double z;

	void build(double a, double b, double c) {
		this.x = a;
		this.y = b;
		this.z = c;
	}

	double getModule() { 
		return this.x * this.x + this.y * this.y + this.z * this.z;
	}

	static Point3D ZERO = new Point3D(); // 0,0,0

	static Point3D max(Point3D[] ps) { // metodo statico
		Point3D max = ZERO; // ricerca max
		for (Point3D elem : ps) {
			if (elem.getModule() > max.getModule()) {
				max = elem;
			}
		}
		return max;
	}
}
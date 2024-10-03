package it.unibo.lifecycle;

// Classe Point3D con solo membri d'istanza (non-static)
class Point3D { // dichiarazione classe
	double x; // 3 campi
	double y;
	double z;

	Point3D build(double a, double b, double c) {
		this.x = a;
		this.y = b;
		this.z = c;
		return this;
	}

	double getModule() { 
		return this.x * this.x + this.y * this.y + this.z * this.z;
	}
}
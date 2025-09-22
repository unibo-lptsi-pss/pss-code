package it.unibo.lifecycle.points;

class Point3D { // dichiarazione classe
    // Questo oggetto di tipo Point3D è condiviso da tutti gli oggetti di tipo Point3D!
    static Point3D ZERO = new Point3D(); // 0,0,0
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

    // Cerca il punto con modulo massimo in un array di punti
    static Point3D max(Point3D[] ps) { // metodo statico: utilità generale fornita da Point3D
        Point3D max = ZERO; // ricerca max
        for (Point3D elem : ps) {
            if (elem.getModule() > max.getModule()) {
                max = elem;
            }
        }
        return max;
    }
}

package it.unibo.lifecycle;

class Points { // Modulo con funzionalità per punti 

    static Point3D ZERO = new Point3D().build(0, 0, 0);

    static Point3D max(Point3D[] ps) { // metodo statico
        Point3D max = zero; // ricerca max
        for (Point3D elem : ps) {
            if (elem.getModule() > max.getModule()) {
                max = elem;
            }
        }
        return max;
    }
}

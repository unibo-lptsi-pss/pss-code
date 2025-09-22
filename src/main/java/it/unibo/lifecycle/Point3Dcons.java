package it.unibo.lifecycle;

public class Point3Dcons {   // dichiarazione classe
    double x;
    double y;
    double z;

    // costruttore
    Point3Dcons(double x, double y, double z) { // nota: assenza di tipo di ritorno
        this.x = x; // metto l'argomento x in this.x
        this.y = y;
        this.z = z;
    }

    static void main(String[] args) {
        // creo l'oggetto usando il costruttore a tre argomenti
        Point3Dcons p = new Point3Dcons(10.0, 20.0, 30.0);
        // stampo
        System.out.println("p: " + p.x + "," + p.y + "," + p.z);
        // costruttore di "default" in questo caso non funziona!
        // Point3D p2 = new Point3D(); NO!!
    }
}

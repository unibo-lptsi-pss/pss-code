class Point3D {
    double x;
    double y;
    double z;

    void build(double a, double b, double c){
        this.x = a;
        this.y = b;
        this.z = c;
    }

    double getNormSquared(){
        return this.x * this.x + this.y * this.y + this.z * this.z;
    }

    boolean equal(Point3D q){
        // true se i due punti sono uguali
        return this.x == q.x && this.y == q.y && this.z == q.z;
    }
}

void main() {
    Point3D p = new Point3D(); // crea un nuovo punto p
    p.build(10.0, 20.0, 30.0); // inizializza il punto
    Point3D q = new Point3D(); // crea un nuovo punto q
    q.build(10.0, 20.0, 31.0); // inizializza il punto q
    double m2 = p.getNormSquared(); // ottiene la norma al quadrato
    boolean samePoint = p.equal(q); // chiedo a p se è uguale a q
    System.out.println(samePoint);
    System.out.println(m2);
}
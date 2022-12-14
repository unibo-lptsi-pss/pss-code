package it.unibo.lifecycle;

class UsePoint3D {
	public static void main(String[] s) {
		// creo e inizializzo vari punti
		Point3D p1 = new Point3D().build(10, 20, 30);
		Point3D p2 = new Point3D().build(5, 6, 7);
		Point3D p3 = new Point3D().build(100, 100, 100);
		Point3D p4 = Points.zero; // questo è lo zero

		// costruisco l'array
		Point3D[] array = new Point3D[] { p1, p2, p3, p4 };

		// calcolo il max
		Point3D max = Points.max(array);

		// stampo
		System.out.println("Max: " + max.x + "," + max.y + "," + max.z);
	}
}
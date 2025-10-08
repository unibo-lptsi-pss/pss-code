package it.unibo.formatting;

/**
 * Point3D is an example showcasing some OO functionality
 * in Java, with a focus on formatting.
 * All properties have default (package) access.
 */
public class Point3D {

    /**
     * A constant representing the origin (0,0,0).
     */
    public static final Point3D ZERO = new Point3D(0, 0, 0);

    private double x;
    private double y;
    private double z;

    /**
     * Constructor for Point3D
     */
    public Point3D(final double x, final double y, final double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    /**
     * Method to compute the square of the module of the point.
     */
    public double getSquareModule() {
        return this.x * this.x + this.y * this.y + this.z * this.z;
    }

    public double getX() {
        return this.x;
    }

    public double getY() {
        return this.y;
    }

    public double getZ() {
        return this.z;
    }

    /**
     * Translate the point by the given amount.
     */
    public void translate(final double x, final double y, final double z) {
        this.x += x;
        this.y += y;
        this.z += z;
    }

    /**
     * Finds the point with the maximum square module from an array of points.
     */
    public static Point3D max(final Point3D[] points) {
        Point3D maximum = Point3D.ZERO;
        for (Point3D point : points) {
            if (point.getSquareModule() > maximum.getSquareModule()) {
                maximum = point;
            }
        }
        return maximum;
    }
}
package it.unibo.lifecycle;

class ExampleOverloading {
    static int m(double a, int b) {
        return 1;
    }

    static int m(int a, double b) {
        return 2;
    }

    static int m2(double a, double b) {
        return 1;
    }

    static int m2(int a, int b) {
        return 2;
    }

    static void main(String[] s) {
        // System.out.println(""+m(1, 1));      // ERROR: reference to m is AMBIGUOUS
        // System.out.println(""+m(1.5, 1.5));  // ERROR: no suitable method found for m(Double,Double)
        System.out.println("" + m(1.5, 1));
        System.out.println("" + m((float) 1, 1));
        System.out.println("" + m(1, 1.5));
        System.out.println("" + m2(1.5, 1.5)); // 1
        System.out.println("" + m2(1, 1));     // 2
    }
}

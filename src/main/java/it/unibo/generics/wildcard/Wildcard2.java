package it.unibo.generics.wildcard;

import it.unibo.generics.generics.Vector;

public class Wildcard2 {
    // Metodo che usa la wildcard
    public static Vector<Integer> toIntVector(Vector<? extends Number> vec) {
        final Vector<Integer> out = new Vector<>();
        for(int i = 0; i < vec.getLength(); i++) {
            // Si noti accesso al metodo intValue() del contratto di Number
            out.addElement(vec.getElementAt(i).intValue());
        }
        return out;
    }

    static void main() {
        final Vector<Double> vd = new Vector<>();
        vd.addElement(1.5);
        vd.addElement(6.7);
        Vector<Integer> vi = toIntVector(vd);
        System.out.println(vi.getElementAt(0) + ", " + vi.getElementAt(1));
        // var vd2 = toIntVector(new Vector<String>()); // ERROR: method not applicable
    }
}

package it.unibo.generics.wildcard;

import it.unibo.generics.generics.Vector;

public class Wildcard3 {
    // Le wildcard pongono limiti sulle operazioni eseguibili
    public static void addElementToVector(Vector<? extends Number> vec) {
        // Per Vector<T> covariante non possiamo invocare metodi che accettano T in input
        final Number n = vec.getElementAt(0); // questo è ok
        Number toAdd = n.doubleValue() + 1;
        // vec.addElement(toAdd); // ERROR!
    }

    public static Number returnFirstNumber(Vector<? super Integer> vec) {
        // Per Vector<T> contravariante non possiamo invocare metodi che restituiscono T in output
        vec.addElement(Integer.valueOf(7)); // questo è ok
        Number out = null;
        // out = vec.getElementAt(0); // ERROR!
        return out;
    }
}

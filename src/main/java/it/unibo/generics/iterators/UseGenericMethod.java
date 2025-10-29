package it.unibo.generics.iterators;

public class UseGenericMethod {
    public static void main(final String... s) {
        final Vector<String> vs = new Vector<>();
        vs.addElement("prova");
        vs.addElement("di");
        vs.addElement("vettore");
        final Vector<Pair<String, Integer>> vp = vs.<Integer>genVectorPair(101);
        final Vector<Pair<String, Integer>> vp2 = vs.genVectorPair(101); // inferenza
        System.out.println("" + vp);
    }
}

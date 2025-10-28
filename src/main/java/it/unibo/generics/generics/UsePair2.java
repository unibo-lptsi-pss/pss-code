package it.unibo.generics.generics;

public class UsePair2 {
    public static void main(String[] s) {
    	// Parametri in new Vector() inferiti dal tipo della variabile  	
    	final Vector<Pair<String,Integer>> v = new Vector<>(); 
    	// Parametri in new Pair(..) inferiti dal tipo degli argomenti
    	v.addElement(new Pair<>("Prova",1));		
    	v.addElement(new Pair<>("Vettore",2));
		final String str = v.getElementAt(0).getFirst() + " " +
			v.getElementAt(1).getFirst(); // Nota, nessun cast!
		System.out.println(str);
		System.out.println(v);
    
    }
}


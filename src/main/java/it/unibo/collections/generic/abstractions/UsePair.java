package it.unibo.collections.generic.abstractions;
import java.io.IO;

public class UsePair{
    public static void main(String[] s){ 	
    	Vector<Pair<String,Integer>> v = new Vector<Pair<String,Integer>>(); 
    	v.addElement(new Pair<String,Integer>("Prova",1));		
    	v.addElement(new Pair<String,Integer>("di",2));		
    	v.addElement(new Pair<String,Integer>("Vettore",3));
    	String str = v.getElementAt(0).getFirst() + " " + 
    		     v.getElementAt(1).getFirst() + " " +
    		     v.getElementAt(2).getFirst(); // Nota, nessun cast!
        IO.println(str);
        IO.println(v);
        
        List<Pair<Integer,Integer>> l = 
          new List<Pair<Integer,Integer>>(new Pair<Integer,Integer>(1,1),
          new List<Pair<Integer,Integer>>(new Pair<Integer,Integer>(2,2),
          new List<Pair<Integer,Integer>>(new Pair<Integer,Integer>(3,3),
          null)));
        IO.println(l);
    }
}


package it.unibo.collections.generic.abstractions;
import java.io.IO;

public class UseList{
    public static void main(String[] s){
    	List<Integer> list = new List<Integer>(10, // Autoboxing
    	    		     new List<Integer>(20,
    	    		     new List<Integer>(30,
    	    		     new List<Integer>(40,null))));
    	// Cast NON necessari
    	int first = list.getHead(); // Unboxing
    	int second = list.getTail().getHead();
    	int third = list.getTail().getTail().getHead();
    	IO.println(first+" "+second+" "+third);
    	IO.println(list.toString());
    	IO.println(list.getLength());
    	
    	// Usabile anche con le stringhe
    	List<String> list2 = new List<String>("a",
    	    		     new List<String>("b",
    	    		     new List<String>("c",
    	    		     new List<String>("d",null))));
    	IO.println(list2.toString());
    }
} 

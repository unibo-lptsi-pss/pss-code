package it.unibo.lambdas.first;

import java.util.*;
import java.io.IO;

public class UseIterators {
	// Uso ancor più compatto del for-each, e sue varianti..
	public static void main(String[] args) {
		final List<Integer> list = Arrays.asList(10,20,30,40,50,60,70);
		list.forEach(x -> System.out.print(x+" "));
		IO.println();
		
		final Collection<Integer> coll = new HashSet<>();
		list.forEach(x -> coll.add(x)); // list.forEach(coll::add);
		IO.println(coll);
		
		final Iterator<Integer> it = list.iterator();
		IO.println(it.next()+" "+it.next());
		it.forEachRemaining( x -> System.out.print(x+" "));
		IO.println();
		
		// Nota: Iterable è una interfaccia funzionale..
		final Iterable<Integer> iterable = () -> list.iterator();
		for (final int i: iterable){ // One of my last uses of "for" :) 
			System.out.print(i+" ");
		}
		for (final int i: (Iterable<Integer>)()->list.iterator()){
			System.out.print(i+" ");
		}
		IO.println();
	}
}

package it.unibo.lambdas.interfaces;
import java.io.IO;

public class UseSimpleIterator {	
	public static void main(String[] args){
		final Counter c = new Counter();
		final SimpleIterator<Integer> si = 
				() -> {c.inc(); return c.getValue();};
		
		IO.println(si.getNext());
		IO.println(si.getListOfNext(20));
	}
}

package it.unibo.lambdas.interfaces;

public class UseSimpleIterator {	
	public static void main(String[] args){
		final Counter c = new Counter();
		final SimpleIterator<Integer> si = 
				() -> {c.inc(); return c.getValue();};
		
		System.out.println(si.getNext());
		System.out.println(si.getListOfNext(20));
	}
}

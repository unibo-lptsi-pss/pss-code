package it.unibo.advancedmechanisms.nested;

import java.util.*;

public class UseCounter {
	public static void main(String[] args) {
		final List<Counter> list = new ArrayList<>();
		list.add(new Counter(100));
		list.add(new Counter.Bidirectional(100));
		list.add(new Counter.Multi(100));
		
		for (final Counter c : list){
			c.increment();
		}
	}
}

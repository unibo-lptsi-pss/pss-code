package it.unibo.streams;

import java.util.*;
import static java.util.stream.Collectors.*;
import java.io.IO;

public class UseCollectors {
	public static void main(String[] args) {
		final List<Integer> li = List.of(10,20,30,5,6,7,10,20,100);
		// una List
		IO.println(li.stream().collect(toList()));
		// un Set
		IO.println(li.stream().collect(toSet())); 
		// un TreeSet
		// IO.println(li.stream().collect(toCollection(TreeSet::new)));
		IO.println(li.stream().collect(minBy(Integer::compare)));
		IO.println(li.stream().collect(summingInt(Number::intValue)).toString());
		IO.println(li.stream().map(i->i.toString())
		                              .collect(joining(",","(",")")));
		// (10,20,30,5,6,7,10,20,100)
	}
}


package it.unibo.lambdas.first;

import java.util.*;
import java.io.IO;

public class FirstStream {
	public static void main(String[] args) {
		final List<Integer> list = List.of(10,20,30,40,50,60,70,80,90);
		
		// for each element, pass it to method println of System.out
		list.stream().forEach(System.out::println); //"10" \n "20" \n "30"

		// Filter and print
		list.stream().filter(i->i>60).forEach(i -> System.out.print(i+" "));
		IO.println(""); //"70 80 90 "
		
		// Map and print
		list.stream().map(i->i+" ").forEach(System.out::print);
		IO.println(""); //"10 20 .. 70 80 90 "
		
		// Map-reduce and print the resulting string
		final String s = list.stream().map(i->i+"|").reduce((x,y) -> x+y).get();
		IO.println(s); //"10|20|..|70|80|90|"		
	}
}

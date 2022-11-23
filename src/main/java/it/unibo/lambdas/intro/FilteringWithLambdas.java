package it.unibo.lambdas.intro;

import java.util.*;

public class FilteringWithLambdas {
	public static void main(String[] args) {
		final List<String> list = Arrays.asList("foo", "bar", "foobar!", "AAAAAAA", "!!!");

		var l1 = new ArrayList<String>(list);
		l1.removeIf((String s) -> { return s.length() > 3; });
		System.out.println(l1); // [foo, bar, !!!]

		var l2 = new ArrayList<String>(list);
		l2.removeIf(s -> { return s.startsWith("f"); });
		System.out.println(l2); // [bar, AAAAAAA, !!!]

		var l3 = new ArrayList<String>(list);
		l3.removeIf((String s) -> s.contains("!"));
		System.out.println(l3);

		var l4 = new ArrayList<String>(list);
		java.util.function.Predicate<String> p = s -> s.matches("(foo)|(bar)");
		l4.removeIf(p.negate());
		System.out.println(l4);
	}
}
package it.unibo.lambdas.intro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.io.IO;

public class FilteringWithLambdas {
    static void main() {
        final List<String> list = Arrays.asList("foo", "bar", "foobar!", "AAAAAAA", "!!!");
        var l1 = new ArrayList<>(list);
        l1.removeIf((String s) -> { return s.length() > 3; }); // Sintassi "completa"
        IO.println(l1); // [foo, bar, !!!]

        var l2 = new ArrayList<>(list);
        l2.removeIf(s -> { return s.startsWith("f"); }); // Sintassi con tipo dell'argomento inferito
        IO.println(l2); // [bar, AAAAAAA, !!!]

        var l3 = new ArrayList<>(list);
        l3.removeIf((String s) -> s.contains("!")); // Sintassi con corpo dell'espressione semplificato
        IO.println(l3);

        var l4 = new ArrayList<>(list);
        l4.removeIf(s -> s.matches("(foo)|(bar)")); // Sintassi più concisa
        IO.println(l4);
    }
}
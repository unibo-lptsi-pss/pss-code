package it.unibo.nested;

import java.util.ArrayList;
import java.util.List;

public class UseCounter {
    static void main() {
        final List<Counter> list = new ArrayList<>();
        list.add(new Counter(100));
        list.add(new Counter.Bidirectional(100));
        list.add(new Counter.Multi(100));

        for (final Counter c : list) {
            c.increment();
        }
    }
}

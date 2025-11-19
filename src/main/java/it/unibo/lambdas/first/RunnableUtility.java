package it.unibo.lambdas.first;

import java.util.List;

public class RunnableUtility {
    private static void repeat(final int howMany, final Runnable r) {
        for (int i = 0; i < howMany; i++) {
            r.run();
        }
    }

    private static void batchExecution(final List<Runnable> list) {
        for (final Runnable r : list) {
            r.run();
        }
    }

    static void main() {
        repeat(10, () -> System.out.println("ok"));
        batchExecution(
            List.of(
                () -> System.out.println("a"),
                () -> System.out.println("b"),
                () -> System.out.println("c"),
                () -> System.exit(0)
            )
        );
    }
}

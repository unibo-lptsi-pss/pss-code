package it.unibo.lambdas.first;

import java.util.List;
import java.io.IO;

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
        repeat(10, () -> IO.println("ok"));
        batchExecution(
            List.of(
                () -> IO.println("a"),
                () -> IO.println("b"),
                () -> IO.println("c"),
                () -> System.exit(0)
            )
        );
    }
}

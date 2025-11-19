package it.unibo.lambdas.first;

import java.util.Arrays;
import java.util.List;

public class AllLambdas2 {
    private static int staticMyCompare(final String a, final String b) { return a.compareTo(b); }

    private int instanceMyCompare(final String a, final String b) { return b.compareTo(a); }

    static void main() {
        final List<String> list = Arrays.asList("a", "bb", "c", "ddd");
        final AllLambdas2 objAL = new AllLambdas2();

        list.sort((x, y) -> staticMyCompare(x, y));
        list.sort(AllLambdas2::staticMyCompare);  // same as above
        System.out.println(list); // [a, bb, c, ddd]

        list.sort((x, y) -> objAL.instanceMyCompare(x, y));
        list.sort(objAL::instanceMyCompare);  // same as above
        System.out.println(list); // [ddd, c, bb, a]

        list.sort((x, y) -> x.compareTo(y));
        list.sort(String::compareTo);  // same as above
        System.out.println(list); // [ddd, c, bb, a]
    }
}

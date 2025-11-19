package it.unibo.lambdas.first;

import java.util.LinkedHashMap;
import java.util.Map;

public class UseMap {
    static void main() {
        final Map<Integer, String> map = new LinkedHashMap<>();
        map.put(10, "a");
        map.put(20, "bb");
        map.put(30, "ccc");
        map.forEach((k, v) -> System.out.println(k + " " + v));

        map.replaceAll((k, v) -> v + k); // nuovi valori
        System.out.println(map);
        // {20=bb20, 10=a10, 30=ccc30}

        map.merge(5, ".", String::concat);
        map.merge(10, ".", String::concat);
        System.out.println(map);
        // {20=bb20, 5=., 10=a10., 30=ccc30}
    }
}

package it.unibo.advancedmechanisms.map;

import java.util.LinkedHashMap;
import java.util.Map;

public class UseMap2 {
    static void main() {
        // Al solito, creo una classe specifica, ma dichiaro (e quindi lavoro) sull'interfaccia
        final Map<Integer, String> map = new LinkedHashMap<>();
        map.put(345211, "Bianchi");
        map.put(345122, "Rossi");
        map.put(243001, "Verdi");
        for (final Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getClass());
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
            entry.setValue(entry.getValue() + " modificata!");
        }
        System.out.println(map);
        // {345211=Bianchi modificata!, 345122=Rossi modificata!, 243001=Verdi modificata!}
    }
}

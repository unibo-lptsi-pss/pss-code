package it.unibo.collections.generic.map;

import java.util.LinkedHashMap;
import java.util.Map;

public class UseMap {
    static void main() {
        // Dichiaro l'interfaccia, istanzio un'implementazione concreta
        final Map<Integer, String> map = new LinkedHashMap<>();
        map.put(345211, "Bianchi");
        map.put(345122, "Rossi");
        map.put(243001, "Verdi");
        System.out.println(map); // {345211=Bianchi, 243001=Verdi, 345122=Rossi}
        map.put(243001, "Neri"); // Rimpiazza Verdi
        final Map<String,Integer> map2 = Map.of("foo", 5, "bar", 7);

        for(final Map.Entry<String,Integer> entry: map2.entrySet()) { // modo prestante per accedere alle coppie
            System.out.println("Chiave: " + entry.getKey() + ", Valore: " + entry.getValue());
        }
        for (final int i: map.keySet()) { // modo per accedere alle sole chiavi
            System.out.println("Chiave: " + i);
        }
        for (final String s: map.values()) { // modo per accedere ai soli valori
            System.out.println("Valore: " + s);
        }
    }
}

package it.unibo.streams;

import java.util.List;

public class UseStreamsOnPerson {
    static void main() {
        final List<Person> list = List.of(
            new Person("Mario", "Cesena", 20000, "Teacher"),
            new Person("Rino", "Forlì", 50000, "Professor"),
            new Person("Lino", "Cesena", 110000, "Professor", "Dean"),
            new Person("Ugo", "Cesena", 20000, "Secretary"),
            new Person("Marco", null, 4000, "Contractor")
        );

        final double result = list.stream()
            .filter(it -> "Cesena".equals(it.getCity())) // Tieni solo i cesenati
            .mapToDouble(Person::getIncome) // Prendi il loro reddito
            .sum(); // Somma
        System.out.println(result);

        // alternativa con iteratore: qual è la più leggibile?
        double totalIncome = 0; // inizializza somma
        for (final Person p: list) { // per ogni persona nella lista
            if ("Cesena".equals(p.getCity())) { // se la città è cesena
                totalIncome = totalIncome + p.getIncome(); // allora la somma aumenta del suo reddito
            }
        }
        System.out.println(totalIncome);
    }
}

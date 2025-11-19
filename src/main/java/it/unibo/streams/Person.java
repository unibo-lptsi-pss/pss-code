package it.unibo.streams;

import java.util.Arrays;
import java.util.Objects;
import java.util.Set;

public final class Person {
    private final String name;
    private final String city;
    private final double income;
    private final Set<String> jobs;
    public Person(String name, String city, double income, String... jobs) {
        this.name = Objects.requireNonNull(name);
        this.city = city; // null in ingresso indica città assente
        this.income = income;
        this.jobs = Set.copyOf(Arrays.asList(jobs)); // conversione a set
    }
    // Getters
    public String getName() { return this.name; }
    public String getCity() { return this.city; }
    public double getIncome() { return this.income; }
    public Set<String> getJobs() { return this.jobs; } // Set immutabile, non serve copia
    // Hashcode, equals, toString
    @Override public int hashCode() { return Objects.hash(name, city, income, jobs); }
    @Override public boolean equals(Object obj) {
        return this == obj
            || obj instanceof Person person
            && Objects.equals(name, person.name)
            && Objects.equals(city, person.city)
            && Double.compare(income, person.income) == 0
            && Objects.equals(jobs, person.jobs);
    }
    @Override public String toString() {
        return "Person [name=" + name + ", city=" + city + ", income=" + income + ", jobs=" + jobs + "]";
    }
}

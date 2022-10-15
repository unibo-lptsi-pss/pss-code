package it.unibo.patterns.strategy;

public class UsePersons {
    public static void sortPeople(Person[] ps, PersonCompareStrategy comparator) {
        boolean sorted = false;
        while(!sorted){
            sorted = true;
            for(int i = 0; i < ps.length-1; i++) {
                if(comparator.compareTwoPeople(ps[i], ps[i+1]) > 0) {
                    Person temp = ps[i];
                    ps[i] = ps[i+1];
                    ps[i+1] = temp;
                    sorted = false;
                }
            }
        }
    }

    public static void printPeople(Person[] people) {
        for(int i = 0; i < people.length; i++) {
            System.out.println("" + i + ") " + people[i].getName() + " " + people[i].getSurname() + 
                " - " + people[i].getYearOfBirth());
        }
    }

    public static void main(String[] args){
        Person p1 = new Person("Mario", "Rossi", 1985);
        Person p2 = new Person("Dario", "Verdi", 1970);
        Person p3 = new Person("Zarco", "Neri", 1952);
        Person[] people = new Person[] { p1, p2, p3 };
        sortPeople(people, new PersonComparatorByAge());
        printPeople(people);
        System.out.println("\n---\n");
        sortPeople(people, new PersonComparatorByFullName());
        printPeople(people);
    }
}

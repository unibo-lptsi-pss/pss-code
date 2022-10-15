package it.unibo.patterns.factorymethod;


public class UsePerson {
    
    public static void main(String[] args){
        PersonFactory pf = new PersonFactoryImpl();
        Person p1 = pf.createBasic("mario", "rossi");
        Person p2 = pf.createAdvanced("dario", "verdi", 1985);
        System.out.println(p1.getName() + " " + p1.getSurname() + " (" + p1.getYearOfBirth() + ")");
        System.out.println(p1.getName() + " " + p1.getSurname() + " (" + p1.getYearOfBirth() + ")");
    }

}

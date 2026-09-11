package it.unibo.streams;

import java.util.*;
import java.util.stream.*;
import java.io.IO;

public class UseStreamsOnPerson2 {
	static void main() {
		final List<Person> list = new ArrayList<>();
		list.add(new Person("Mario","Cesena",20000,"Teacher"));
		list.add(new Person("Rino","Forlì",50000,"Professor"));
		list.add(new Person("Lino","Cesena",110000,"Professor","Dean","Secretary"));
		list.add(new Person("Ugo","Cesena",20000,"Secretary"));
		list.add(new Person("Marco",null,4000,"Contractor"));
		
		// Jobs of people from Cesena
		final String res = list.stream()
            .filter(p -> p.getCity().equals("Cesena"))
            .flatMap(p->p.getJobs().stream())
            .distinct()
            .collect(Collectors.joining("|", "[[", "]]"));
		IO.println(res);
		
		// Average income of professors
		final double avg = 
				list.stream()
				    .filter(p->p.getJobs().contains("Professor"))
					.mapToDouble(Person::getIncome)
					.average().getAsDouble();
		
		IO.println(avg);
		IO.println(
				list.stream()
				    .filter(p->p.getJobs().contains("Professor"))
				    .mapToDouble(Person::getIncome).average());
	}
}   

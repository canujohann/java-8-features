package jp.alj;

import java.util.Arrays;
import java.util.List;

import jp.alj.common.Person;

public class CollectionDemonstration {

	public static void main(String[] args) {
		List<Person> persons = Arrays.asList(new Person("Yann", 13), new Person("Adam", 15), new Person("Franck", 31));
		
		// Old way to iterate objects List
		for(Person p: persons) {
			System.out.println( p.getName() + " is in the list");
		}
		
		// Internal iteration with lambda (from JDK 1.8)
		persons.forEach(p -> System.out.println( p.getName() + " is in the list (with lambda)"));
		
		//Stream API: map, filter, foreach
		persons.stream()
		.filter(p -> p.getAge() > 18)
		.forEach(p -> System.out.println( p.getName() + " is over 18"));
		
		// In a parallel way
		persons.parallelStream()
		.filter(p -> p.getAge() > 18)
		.forEach(p -> System.out.println( p.getName() + " is over 18 (parallelStream"));
		
	}

}

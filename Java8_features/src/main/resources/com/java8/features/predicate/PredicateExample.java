package com.java8.features.predicate;

import java.util.Arrays;
import java.util.List;

public class PredicateExample {

	public static void main(String args[]) {

		List<Integer> numberList = Arrays.asList(2, 3, 4, 5, 6, 7, 8, 9, 10, 12);

		System.out.println("Even NumberList");
		PredicateUtility.returnList(numberList, PredicateConditions.evenNumberCondition()).forEach(System.out::println);

		System.out.println("Odd NumberList");
		PredicateUtility.returnList(numberList, PredicateConditions.OddNumberCondition()).forEach(System.out::println);

	}

}

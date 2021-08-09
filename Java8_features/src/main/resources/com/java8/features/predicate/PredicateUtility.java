package com.java8.features.predicate;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateUtility {


	static List<Integer> returnList(List<Integer> list, Predicate<Integer> predicate) {
		return list.stream().filter(predicate).collect(Collectors.toList());

	}

}

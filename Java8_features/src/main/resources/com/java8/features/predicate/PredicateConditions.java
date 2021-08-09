package com.java8.features.predicate;

import java.util.function.Predicate;

public class PredicateConditions {

	public static Predicate<Integer> evenNumberCondition() {
		Predicate<Integer> pre = a -> a % 2 == 0;
		return pre;

	}

	public static Predicate<Integer> OddNumberCondition() {
		Predicate<Integer> pre = a -> a % 2 != 0;
		return pre;
	}

}

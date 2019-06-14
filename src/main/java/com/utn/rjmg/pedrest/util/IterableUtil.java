package com.utn.rjmg.pedrest.util;

import java.util.Collection;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

public class IterableUtil {	
	public static <T> Collection<T> getCollectionFromIterable(Iterable<T> iterable) {
		return StreamSupport
				.stream(iterable.spliterator(), false)
				.collect(Collectors.toList());
	}
}

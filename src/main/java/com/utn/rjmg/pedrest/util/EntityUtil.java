package com.utn.rjmg.pedrest.util;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.apache.commons.lang3.tuple.Pair;

import com.google.common.collect.Sets;

public class EntityUtil {
	@SuppressWarnings("unchecked")
	public static List<Method> getDeclaredGetters(Class<?> c) {
		return (List<Method>) Arrays.asList(c.getDeclaredMethods())
		.stream()
		.filter((m) -> MethodUtil.isGetter(m))
		.collect(Collectors.toList());
	}
	
	@SuppressWarnings("unchecked")
	public static List<Method> getDeclaredSetters(Class<?> c) {
		return (List<Method>) Arrays.asList(c.getDeclaredMethods())
		.stream()
		.filter((m) -> MethodUtil.isSetter(m))
		.collect(Collectors.toList());
	}
	
	@SuppressWarnings("unchecked")
	public static List<Method> getGetters(Class<?> c) {
		return (List<Method>) Arrays.asList(c.getMethods())
		.stream()
		.filter((m) -> MethodUtil.isGetter(m))
		.collect(Collectors.toList());
	}
	
	@SuppressWarnings("unchecked")
	public static List<Method> getSetters(Class<?> c) {
		return (List<Method>) Arrays.asList(c.getMethods())
		.stream()
		.filter((m) -> MethodUtil.isSetter(m))
		.collect(Collectors.toList());
	}
	
	@SuppressWarnings("unchecked")
	public static List<Method> getNonTransientDeclaredGetters(Class<?> c) {
		return (List<Method>) Arrays.asList(c.getDeclaredMethods())
		.stream()
		.filter((m) -> MethodUtil.isGetter(m) && !MethodUtil.isTransient(m))
		.collect(Collectors.toList());
	}
	
	public static List<Pair<Method, Method>> getNonTransientGetterAndSetterPairs(Class<?> c) {
		List<Method> getters = getDeclaredGetters(c);
		List<Method> setters = getDeclaredSetters(c);
		List<String> commonFieldNames = 
				 Sets
					.intersection(
						Sets.newHashSet(
							getters.stream()
							.map((g) -> MethodUtil.getFieldNameIfMethodIsGetterOrSetter(g))
							.collect(Collectors.toList())), 
						Sets.newHashSet(
							setters.stream()
							.map((s) -> 
							MethodUtil.getFieldNameIfMethodIsGetterOrSetter(s))
							.collect(Collectors.toList())))
					.stream()
					.collect(Collectors.toList());
		List<Pair<Method, Method>> pairList = new ArrayList<Pair<Method,Method>>();
		for (final String fieldName : commonFieldNames) {
			Optional<Method> getter = getters
					.stream()
					.filter((g) -> MethodUtil.getFieldNameIfMethodIsGetterOrSetter(g)
							.equals(fieldName))
					.findFirst();
			Optional<Method> setter = setters
					.stream()
					.filter((s) -> MethodUtil.getFieldNameIfMethodIsGetterOrSetter(s)
							.equals(fieldName))
					.findFirst();
			if (getter.isPresent() && setter.isPresent()) {
				pairList.add(Pair.of(getter.get(), setter.get()));
			}
		}
		return pairList;					
	}
	
	
}

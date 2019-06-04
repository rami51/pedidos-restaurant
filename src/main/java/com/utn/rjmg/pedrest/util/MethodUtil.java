package com.utn.rjmg.pedrest.util;

import java.lang.reflect.Method;
import java.util.Arrays;

public class MethodUtil {
	private static String NORMAL_GETTER = "get";
	private static String BOOLEAN_GETTER = "is";
	private static String NORMAL_SETTER = "set";
	
	public static boolean isGetter (Method method) {
		boolean methodWithoutParameters = Arrays.asList(method.getParameters()).isEmpty();
		return methodWithoutParameters
				&& (NORMAL_GETTER.equals(method.getName().substring(0, 3))
				|| BOOLEAN_GETTER.equals(method.getName().substring(0, 2)));
	}
	
	public static boolean isSetter (Method method) {
		return NORMAL_SETTER.equals(method.getName().substring(0, 3));
	}
}

package com.utn.rjmg.pedrest.util;

import java.lang.reflect.Method;
import java.util.Arrays;

import javax.persistence.Transient;

public class MethodUtil {
	private static String NORMAL_GETTER_PREFIX = "get";
	private static String BOOLEAN_GETTER_PREFIX = "is";
	private static String NORMAL_SETTER_PREFIX = "set";
	
	public static boolean isGetter (Method method) {
		boolean methodWithoutParameters = Arrays.asList(method.getParameters()).isEmpty();
		return methodWithoutParameters
				&& (NORMAL_GETTER_PREFIX.equals(method.getName().substring(0, 3))
				|| BOOLEAN_GETTER_PREFIX.equals(method.getName().substring(0, 2)));
	}
	
	public static boolean isSetter (Method method) {
		return NORMAL_SETTER_PREFIX.equals(method.getName().substring(0, 3));
	}
	
	public static boolean isTransient(Method method) {
		return method.isAnnotationPresent(Transient.class);
	}
	
	public static String getFieldNameIfMethodIsGetterOrSetter(Method m) {
		if (isGetter(m)) {
			return m.getName().substring(NORMAL_GETTER_PREFIX.length() - 1 , m.getName().length());
		} else if (isSetter(m)) {
			m.getName().substring(NORMAL_SETTER_PREFIX.length() - 1 , m.getName().length());
		}
		return null;
	}
}

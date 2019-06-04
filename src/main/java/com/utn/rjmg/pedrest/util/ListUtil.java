package com.utn.rjmg.pedrest.util;

import java.util.List;

public class ListUtil {
	
	@SuppressWarnings("rawtypes")
	public static boolean isNullOrEmpty(List list) {
		return (list != null && !list.isEmpty());
	}
}

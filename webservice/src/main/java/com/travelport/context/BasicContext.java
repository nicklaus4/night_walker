package com.travelport.context;

import org.slf4j.MDC;

import java.util.HashMap;
import java.util.Map;

public class BasicContext {

	private Map<String, Object> map = new HashMap<String, Object>();

	private static final String REQUEST_ID = "requestId";

	public static void setRequestId(String requestId) {
		MDC.put(REQUEST_ID, requestId);
	}

	public static String requestId() {
		return MDC.get(REQUEST_ID);
	}

	public static void release() {
		MDC.remove(REQUEST_ID);
	}
}

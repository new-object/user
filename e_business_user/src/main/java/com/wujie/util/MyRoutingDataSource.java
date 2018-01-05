package com.wujie.util;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

public class MyRoutingDataSource extends AbstractRoutingDataSource {

	private static ThreadLocal<String> key = new ThreadLocal<String>();
	
	public static String getKey() {
		return key.get();
	}

	public static void setKey(String key1) {
		key.set(key1);
	}

	/**
	 * 在方法中选择数据源  为了避免线程安全问题 使用threadlocal
	 */
	@Override
	protected Object determineCurrentLookupKey() {
		
		return key.get();
	}
}
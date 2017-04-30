package com.g33kzone.Singleton;

public class SingletonBillPugh {

	// private static SingletonBillPugh instance;

	public SingletonBillPugh() {
	}

	private static class SingletonBillPughHelper {
		private static final SingletonBillPugh instance = new SingletonBillPugh();

	}

	public static SingletonBillPugh getInstance() {
		return SingletonBillPughHelper.instance;
	}

}

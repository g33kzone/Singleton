package com.g33kzone.Singleton;

public class SingletonStatic {

	private static SingletonStatic instance;

	private SingletonStatic() {
	}

	// Static block to incorporate Exception handling
	static {

		try {
			instance = new SingletonStatic();
		} catch (Exception e) {
			System.out.println("Exception - Singleton instance creation");
		}
	}

	public static SingletonStatic getInstance() {
		return instance;
	}

}

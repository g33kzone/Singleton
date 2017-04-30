package com.g33kzone.Singleton;

public class Singleton {

	private static Singleton instance = new Singleton();

	// Private Constructor - to ensure this class cannot be instantiated
	private Singleton() {
	}

	// Only getter method
	public static Singleton getInstance() {
		return instance;
	}

}

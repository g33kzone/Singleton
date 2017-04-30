package com.g33kzone.Singleton;

public class SingletonThreadSafeDouble {

	private static SingletonThreadSafeDouble instance;

	private SingletonThreadSafeDouble() {
	}

	public static SingletonThreadSafeDouble getInstance() {

		if (instance == null) {

			synchronized (SingletonThreadSafeDouble.class) {
				if (instance == null) {
					instance = new SingletonThreadSafeDouble();
				}
			}
		}

		return instance;
	}

}
	
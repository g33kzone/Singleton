package com.g33kzone.Singleton;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		Singleton instanceOne = Singleton.getInstance();
		System.out.println("Instance One :: " + instanceOne.hashCode());

		Singleton instanceTwo = Singleton.getInstance();
		System.out.println("Instance Two :: " + instanceTwo.hashCode());

	}
}

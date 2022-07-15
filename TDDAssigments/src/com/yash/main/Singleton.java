//Write a Junit test to check given two objects are belong to singleton class or not.
package com.yash.main;

import java.util.HashMap;
import java.util.Map;

public class Singleton {
	private static Singleton instance = null;

	private Singleton() {
	}

	public static Singleton getInstance() {
		if (instance == null) {
			instance = new Singleton();
		}
		return instance;
	}
}
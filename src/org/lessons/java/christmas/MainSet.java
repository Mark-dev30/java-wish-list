package org.lessons.java.christmas;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class MainSet {
	public static void main(String[] args) {
		Random rd = new Random();
		Set<Integer> myList = new HashSet<>();
		while(5>myList.size()) {
			myList.add(rd.nextInt(2,13));
		}
		System.out.println(myList);
	}
}

package org.lessons.java.christmas;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class MainSet {
	public static void main(String[] args) {
		Random rd = new Random();
		Set<Integer> myList = new HashSet<>();
		for(int i=0;5>myList.size(); i++) {
			myList.add(rd.nextInt(2,12));
		}
		System.out.println(myList);
	}
}

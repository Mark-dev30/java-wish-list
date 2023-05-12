package org.java.mymap;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {
	public static void main(String[] args) {
		String str = "Lorem ipsum dolor, sit amet consectetur adipisicing elit. Totam - repudiandae est, alias in ullam excepturi ipsam modi odio Lorem ipsum dolor asperiores voluptatum, # quam distinctio ! Lorem ipsum dolor, sit amet consectetur adipisicing elit. Totam repudiandae Totam repudiandae est ; accusantium voluptatum, quam distinctio aut magnam quod veniam esse nesciunt debitis.";
		Map<String, Integer> charCounter = new HashMap<>();
		
		for(String word : Arrays.asList(str.split(" "))) {
			if(charCounter.containsKey(word)) {
				charCounter.put(word, charCounter.get(word) + 1);
			}
			else {
				charCounter.put(word, 1);
			}
		}
		System.out.println(charCounter);
		System.out.println("-----Bonus-----");
		Map<String, Integer> newCharCounter = new HashMap<>();
		String newStr = str.replaceAll("[;\\!\\#\\-\\.\\,]", "");
		
		for(String word : Arrays.asList(newStr.split(" "))) {
			if(word.equals("")) continue;
			if(newCharCounter.containsKey(word)) {
				newCharCounter.put(word, newCharCounter.get(word) + 1);
			}
			else {
				newCharCounter.put(word, 1);
			}
			
		}
		System.out.println(newCharCounter);
		
		
	}
}

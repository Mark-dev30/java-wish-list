package org.lessons.java.christmas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		List<String> myList = new ArrayList<>();
		boolean boll = true;
		Scanner in = new Scanner(System.in);
		//FIRST METHOD
//		while(boll) {
//			System.out.println("Inserisci un desiderio o scrivi 'annulla' per fermare l'esecuzione");
//			String wish = in.nextLine();
//			in.close();
//			if(wish.equals("annulla")) {
//				System.out.println("-------Lista dei desideri: -------");
//				for(String val : myList) {
//					System.out.println(val);
//					
//				}
//				break;
//			}
//			else {
//				myList.add(wish);
//				System.out.println("La lunghezza della lista è: " + myList.size());
//			}
//		}
		//SECOND METHOD
		while(boll) {
			System.out.println("Inserisci un desiderio");
			String wish = in.nextLine();
			myList.add(wish);
			System.out.println("La lunghezza della lista è: " + myList.size());
			System.out.println("Se Vuoi continuare a inserire un desiderio scrivi 'si'?");
			String request = in.nextLine();
			if(!request.equals("si")) {
				System.out.println("-------Lista dei desideri: -------");
				for(String val : myList) {
					System.out.println(val);
					
				}
				break;
			}
		}
		
		
	}
}

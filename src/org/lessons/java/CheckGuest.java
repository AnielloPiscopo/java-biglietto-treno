package org.lessons.java;

import java.util.Scanner;

public class CheckGuest {
	public static void main(String[] args) {
		// Data
		String[] guestsList = {"Dua Lipa", "Paris Hilton", "Manuel Agnelli", "J-Ax", "Francesco Totti", "Ilary Blasi", "Bebe Vio", "Luis", "Pardis Zarei", "Martina Maccherone", "Rachel Zeilic"};
		
		// Receiving data in input
		Scanner in = new Scanner(System.in);
		System.out.println("Inserisci il tuo nome: ");
		String userName = in.nextLine();
		in.close();
		
		//First method: for
		for(int i=0 ; i<guestsList.length; i++) {
			if(userName.equals(guestsList[i])) {
				System.out.println("Ok puoi entrare");
				return;
			}
		}
		
		System.out.println("Non puoi entrare");
		
		//Second method: while
		int i = 0;
		while(i<guestsList.length) {
			if(userName.equals(guestsList[i])) {
				System.out.println("Ok puoi entrare");
				return;
			}
			i++;
		}
	}
}

package org.lessons.java;

import java.util.Scanner;

public class CalcolaBiglietto {
	public static void main(String[] args) {
		int kmToTravel = 0;
		int userAge = 0;
		float ticketPriceMoltiplicatorUnit = 0.21f;
		
		Scanner in = new Scanner(System.in);
		
		do {
			System.out.print("Quanti km dovrai percorrere? ");
			kmToTravel = in.nextInt();	
		}while(kmToTravel <= 0);
		
		float ticketPriceWithoutDiscount = kmToTravel * ticketPriceMoltiplicatorUnit;
		
		do {
			System.out.print("Quanti anni hai ? ");
			userAge = in.nextInt();
		}while(userAge <= 0);
		
		float discount = (userAge < 18) ? ticketPriceWithoutDiscount/100 * 20 : (userAge > 65) ? ticketPriceWithoutDiscount/100 * 40 : 0;
		float ticketPrice = ticketPriceWithoutDiscount - discount;
		
		System.out.println("Prezzo totale: " + String.format("%.2f",ticketPrice));
		in.close();
	}
}

package org.lessons.java;

import java.util.Scanner;

public class CalcolaBiglietto {
public static void main(String[] args) {
	String kmToTravel;
	String userAge;
	
	float ticketPriceMoltiplicatorUnit = 0.21f;
	
	Scanner in = new Scanner(System.in);
	System.out.print("Quanti km dovrai percorrere? ");
	kmToTravel = in.nextLine();
	int km = Integer.parseInt(kmToTravel);			
	float ticketPriceWithoutDiscount = km*ticketPriceMoltiplicatorUnit;
	
	System.out.print("Quanti anni hai ? ");
	userAge = in.nextLine();
	int userAgeNum =Integer.parseInt(userAge);
	
	float discount = (userAgeNum < 18) ? ticketPriceWithoutDiscount/100 * 20 : (userAgeNum > 65) ? ticketPriceWithoutDiscount/100 * 40 : 0;
	float ticketPrice = ticketPriceWithoutDiscount - discount;
	
	System.out.println(ticketPrice);
	in.close();
}
}

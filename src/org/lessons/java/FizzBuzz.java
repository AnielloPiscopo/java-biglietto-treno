package org.lessons.java;

import java.util.Scanner;

public class FizzBuzz {
	public static void main(String[] args) {
		// Main Trace
		int minValue = 1;
		int maxValue = 100;
		for(int i=minValue ; i<maxValue ; i++) {
			String response = (i%3 == 0 && i%5 == 0) ? "FizzBuzz" : (i%3 == 0) ? "Fizz" : (i%5 == 0) ? "Buzz" : ""+i;
			System.out.println(response);
		}
		
		
		// Bonus
		Scanner in = new Scanner(System.in);
		do {
			System.out.print("Digita il nuovo valore massimo: ");
			maxValue = in.nextInt();
			for(int i=minValue ; i<=maxValue ; i++) {
				String response = (i%3 == 0 && i%5 == 0) ? "FizzBuzz" : (i%3 == 0) ? "Fizz" : (i%5 == 0) ? "Buzz" : ""+i;
				System.out.println(response);
			}
		}while(maxValue <= 1);
		in.close();
	}
}

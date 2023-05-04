package org.lessons.java;

import java.util.Random;
import java.util.Scanner;

public class FizzBuzz {
	public static void main(String[] args) {
		int minValue = 1;
		int maxValue = 100;
		Random rnd = new Random();
		int randomNumber = rnd.nextInt(minValue , maxValue);
		System.out.println("Il numero generato casualmente che va da 1 a 100 è: " + randomNumber);
		String response = (randomNumber%3 == 0 && randomNumber%5 == 0) ? "FizzBuzz" : (randomNumber%3 == 0) ? "Fizz" : (randomNumber%5 == 0) ? "Buzz" : "Niente FizzBuzz";
		System.out.println(response);
		
		Scanner in = new Scanner(System.in);
		do {
			System.out.print("Digita il nuovo valore massimo: ");
			maxValue = in.nextInt();
			randomNumber = rnd.nextInt(minValue , maxValue);
			System.out.println("Il numero generato stando al limite dato da te è: " + randomNumber);
			response = (randomNumber%3 == 0 && randomNumber%5 == 0) ? "FizzBuzz" : (randomNumber%3 == 0) ? "Fizz" : (randomNumber%5 == 0) ? "Buzz" : "Niente FizzBuzz";
			System.out.println(response);
		}while(randomNumber <= 1);
		in.close();
	}
}

package org.lessons.java;

public class CibiPreferiti {
	public static void main(String[] args) {
		String[] favouriteFoods = {"pizza" , "pasta" , "lasagne" , "patatine" , "nutella"};
		int favoutiteFoodsListLength = favouriteFoods.length;
		System.out.println("Nella mia lista ho " + favoutiteFoodsListLength + "cibi preferiti");
		System.out.println("Il mio cibo prefetito è: " + favouriteFoods[0]);
		System.out.println("Il cibo che mi piace di meno è: " + favouriteFoods[favoutiteFoodsListLength - 1]);
		
		if(favoutiteFoodsListLength%2 != 0) {
			System.out.println("Il cibo che sta nel mezzo è: " + favouriteFoods[favoutiteFoodsListLength/2]);
		}else {
			System.out.println("I cibi che stanno nel mezzo sono " + favouriteFoods[favoutiteFoodsListLength/2 - 1] + " e " + favouriteFoods[favoutiteFoodsListLength/2]);
		}
	}
}

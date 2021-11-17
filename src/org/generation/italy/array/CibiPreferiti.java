package org.generation.italy.array;

public class CibiPreferiti {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] favFood = {"Hamburger", "Pollo", "Gamberi", "Piadina", "Pizza", "Ramen", "Polenta"};
		int ranking = favFood.length;
		
		System.out.println("La classifica contiene " + ranking + " elementi.");
		System.out.println("Primo posto in classifica: " + favFood[ranking - ranking]);
		System.out.println("Ultimo posto in classifica: " + favFood[ranking - 1]);
	}

}

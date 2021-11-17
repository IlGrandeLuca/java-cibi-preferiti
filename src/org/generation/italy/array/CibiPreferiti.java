package org.generation.italy.array;

import java.util.Scanner;

public class CibiPreferiti {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] favFood = {"Hamburger", "Pollo", "Gamberi", "Piadina", "Pizza", "Ramen", "Latte", "Polenta"};
		String[] favFood2 = {"Hamburger", "Pollo", "Gamberi", "Pizza", "Ramen", "Latte", "Polenta"};
		String midPosition;
		String topPosition = null;
		String lastPosition = null;
		
		Scanner in = new Scanner(System.in);
		System.out.print("Enter 0 for even string or 1 for odd string: ");
		int choose = in.nextInt();
		int ranking = 0;
		
		if (choose == 0) {
			
			ranking = favFood.length;
			topPosition = favFood[ranking - ranking];
			lastPosition = favFood[ranking - 1];
			
		} else if (choose == 1) {
			
			ranking = favFood2.length;
			topPosition = favFood2[ranking - ranking];
			lastPosition = favFood2[ranking - 1];
			
		} else {
			
			System.out.println("Error...");
			
		}
		
		int remainder = ranking % 2;
		
		System.out.println("This ranking contains " + ranking + " items.");
		System.out.println("Top ranking position: " + topPosition);
		System.out.println("Last ranking position: " + lastPosition);
		
		if (remainder == 0) {
			
			ranking = (ranking / 2) - 1;
			midPosition = favFood[ranking];
			
		} else {
			
			ranking = ranking / 2;
			midPosition = favFood2[ranking];
			
		}
		
		System.out.println("Mid ranking position: " + midPosition);
		
		in.close();
		
	}

}

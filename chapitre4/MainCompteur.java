package application;

import modeles.Compteur;

public class MainCompteur {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Compteur c1 = new Compteur();
		System.out.println(c1.getValeur());		//0
		for (int i = 0; i < 5; i++) {
			c1.incrementer();	
		}
		System.out.println(c1.getValeur());		//5
		c1.incrementer(10);
		System.out.println(c1.getValeur());		//15
		for (int i = 0; i < 7; i++) {
			c1.decrementer();	
		}
		System.out.println(c1.getValeur());		//8
		c1.decrementer(3);
		System.out.println(c1.getValeur());		//5
		c1.decrementer(7);
		System.out.println(c1.getValeur());		//0
	}
}

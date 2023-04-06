package chapitre3;

import java.util.Scanner;

public class E2 {
	static Scanner sc = new Scanner(System.in);
	public static int saisie() {
		System.out.println("Entrer un entier:");
		int i = sc.nextInt();
		return i;
	}
	public static int genererNbAleatoire(int n) {
		int nb = (int) (n * Math.random());
		return nb ;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int borne = saisie() ;
		int x = genererNbAleatoire(borne);
		int nombre ;
		do {
			System.out.println("Donner un nombre:");
			nombre = sc.nextInt();
			if (nombre > x)
				System.out.println("Trop grand");
			if (nombre < x)
				System.out.println("Trop petit");
		}while (nombre!=x);
		System.out.println("Vous avez gagné");
	}

}

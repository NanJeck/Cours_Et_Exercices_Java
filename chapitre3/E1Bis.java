package chapitre3;

import java.util.Scanner;

public class E1Bis {
	public static int saisieLongueur() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Longueur:");
		int longueur = sc.nextInt();
		//sc.close();
		return longueur;
	}
	public static int saisieLargeur() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Largeur:");
		int largeur = sc.nextInt();
		sc.close();
		return largeur;
	}
	public static int calculAireRectangle(int L, int l) {
		int aire = L * l ;
		return aire;
	}
	public static void afficheAire(int aire) {
		System.out.println("Aire = "+aire);
	}
	public static void main(String []args) {
		int longueur = saisieLongueur() ;
		int largeur = saisieLargeur() ;
		int aire = calculAireRectangle(longueur,largeur);
		afficheAire(aire);
	}

}

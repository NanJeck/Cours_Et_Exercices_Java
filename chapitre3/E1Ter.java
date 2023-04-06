package chapitre3;

import java.util.Scanner;

public class E1Ter {
	public static void main(String []args) {
		//int aire = calculAireRectangle(saisieLongueur(),saisieLargeur());
		afficheAire(calculAireRectangle(saisieLongueur(),saisieLargeur()));
	}
	static Scanner sc = new Scanner(System.in);
	public static int saisieLongueur() {
		System.out.println("Longueur:");
		int longueur = sc.nextInt();
		return longueur;
	}
	public static int saisieLargeur() {
		System.out.println("Largeur:");
		int largeur = sc.nextInt();
		return largeur;
	}
	public static int calculAireRectangle(int L, int l) {
		int aire = L * l ;
		return aire;
	}
	public static void afficheAire(int aire) {
		System.out.println("Aire = "+aire);
	}
}

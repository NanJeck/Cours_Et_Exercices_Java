package chapitre2;

import java.util.Scanner;

public class ExempleTableauNew {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int []stagiaires;
		System.out.println("Combien de stagiaires");
		int nb = sc.nextInt();
		// Création du tableau
		stagiaires = new int[nb];
		System.out.println("Avant le remplissage");
		for (int note : stagiaires)
			System.out.print(note+" ");
		System.out.println();
		//Remplissage du tableau
		for(int i=0; i<stagiaires.length; i++) {
			System.out.println("Note du stagiaire N°"+(i+1));
			stagiaires[i] = sc.nextInt();
		}
		//Affichage du tableau
		System.out.println("Après le remplissage");
		for (int note : stagiaires)
			System.out.print(note+" ");
		System.out.println();
		String [] t = new String[3] ;
		for (String s : t)
			System.out.print(s+" ");
		t[0] = "toto"; t[1] = "titi" ; t[2]	="baba";
		System.out.println();
		for (String s : t)
			System.out.print(s+" ");
	}
}

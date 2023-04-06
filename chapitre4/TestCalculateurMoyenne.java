package application;

import java.util.Scanner;

import modeles.CalculateurMoyenne;

public class TestCalculateurMoyenne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		///Bon fonctionnement
		CalculateurMoyenne moy = new CalculateurMoyenne();
		int nombre ;
		boolean b ;
		do {
			System.out.println("Nombre de notes:");
			nombre= sc.nextInt();
			b = moy.lireNombreNote(nombre);
			if (b==false)
				System.out.println("Nombre incorrect");
		}while (b==false);
		
		for (int i = 0; i < moy.getNbNotes(); i++) {
			boolean r;
			do {
				System.out.println("Note:");
				double note = sc.nextDouble();
				r = moy.lireNote(note, i);
				if (r==false)
					System.out.println("Note incorrecte");
			} while (r == false);			//erreur note <0 ou >20
		}
		double[] n = moy.getNotes();
		System.out.println("Notes entrées:");
		for (double x : n)
			System.out.print(x + " ");
		System.out.println("\nMoyenne: " + moy.getMoyenne());
		
		//////// Erreur, pas de nombre de notes donné
		CalculateurMoyenne moy1 = new CalculateurMoyenne();
		if (moy1.getMoyenne() == -1)
			System.out.println("pas de nombre de notes saisi");
		//////////Erreur, saisie d'une note sans saisie du nombre de notes
		System.out.println(moy1.lireNote(5, 1));
		//// Autre solution, mais pas de gestion d'erreur sur les notes
		double notes[] = { 8, 8, 10, 11, 12, 13, 14 };
		System.out.println(moy1.getMoyennePourTableauEntier(notes));
	}

}

package chapitre2;

import java.util.Scanner;

public class E2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int []valeurs = new int[8];
		for (int i=0; i<8; i++) {
			System.out.println("Valeur N°"+(i+1));
			valeurs[i] = sc.nextInt();
		}
		for (int v: valeurs)
			System.out.print(v+" ");
		System.out.println();
		System.out.println("Quelle est la valeur recherchée?");
		int val = sc.nextInt();
		int cpt = 0 ;
		for (int i=0; i<valeurs.length;i++) {
			if (valeurs[i]==val)
				cpt++;
		}
		System.out.println("Nombre d'occurences de "+val+": "+cpt);
	}
}

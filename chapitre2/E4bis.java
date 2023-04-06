package chapitre2;

import java.util.Scanner;

public class E4bis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int []valeurs = new int[10];
		for (int i=0; i<10; i++) {
			System.out.println("Valeur N°"+(i+1));
			valeurs[i] = sc.nextInt();
		}
		for (int v: valeurs)
			System.out.print(v+" ");
		System.out.println();
		int val1 ;
		int val2 ;
		do {
			System.out.println("Quelle est la valeur minimale?");
			val1 = sc.nextInt();
			System.out.println("Quelle est la valeur maximale?");
			val2 = sc.nextInt();
			if (val1>val2)
				System.out.println("Valeurs incorrectes");
		} while (val1 > val2);
		int cpt = 0 ;
		for (int i=0; i<valeurs.length;i++) {
			if (valeurs[i]>=val1 && valeurs[i]<=val2)
				cpt++;
		}
		System.out.println("Nombre de valeurs dans l'intervalle:" +cpt);
		}
}

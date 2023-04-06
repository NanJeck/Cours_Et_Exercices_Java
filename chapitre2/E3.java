package chapitre2;

import java.util.Scanner;

public class E3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] valeurs = new int[10];
		for (int i = 0; i < 10; i++) {
			System.out.println("Valeur N°" + (i + 1));
			valeurs[i] = sc.nextInt();
		}
		for (int v : valeurs)
			System.out.print(v + " ");
		System.out.println();
		int max = valeurs[0];
		int min = valeurs[0];
		for (int i = 1; i < valeurs.length; i++) {
			if (max < valeurs[i])
				max = valeurs[i];
			if (min > valeurs[i])
				min = valeurs[i];
		}
		System.out.println("1: Max = " + max + ", Min = " + min);
		//////////////////// 2ème version
		max = valeurs[0];
		min = valeurs[0];
		for (int i = 1; i < valeurs.length; i++) {
			max = Math.max(max, valeurs[i]);
			min = Math.min(min, valeurs[i]);
		}
		System.out.println("2 : Max = " + max + ", Min = " + min);
	}
}

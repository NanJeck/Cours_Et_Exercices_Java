package chapitre1;

import java.util.Scanner;

public class E113 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n ;
		do {
			System.out.println("Donnez un nombre entier:");
			n = sc.nextInt();
			if (n<0 || n>3)
				System.out.println("Valeur hors intervalle");
		}while (n<0 || n>3);
		System.out.println("Bien vu");
	}
}

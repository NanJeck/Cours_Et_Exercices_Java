package chapitre1;

import java.util.Scanner;

public class E1111 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int nbLigne ;
		System.out.println("Nombre de lignes du sapin:");
		nbLigne = sc.nextInt();
		for (int ligne=1 ; ligne <=nbLigne ; ligne++) {
			for (int nbEspace = 0; nbEspace <nbLigne-ligne; nbEspace++)
				System.out.print(" ");
			for (int nbEtoile=0; nbEtoile<1+(ligne-1)*2;nbEtoile++)
				System.out.print("*");
			System.out.println();
		}
	}
}

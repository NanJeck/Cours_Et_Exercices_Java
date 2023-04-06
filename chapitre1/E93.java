package chapitre1;

import java.util.Scanner;

public class E93 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int remise = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Quel est le montant de votre achat?");
		double montant = sc.nextDouble(); // un montant
		if (montant >= 350 && montant <600) {
			montant *= 0.97 ;
			remise = 3 ;
		}
		if (montant >= 600) {
			montant *= 0.95 ;
			remise = 5 ;
		}
		if (remise==0)
			System.out.println("Espèce de radin, pas de remise, fallait dépenser!!!");
		else 
			System.out.println("Parfait, vous avez une remise de "+remise+"%.");
		//System.out.println("Montant de votre achat: "+montant);
		System.out.printf("Montant de votre achat: %.2f€",montant);
	}

}

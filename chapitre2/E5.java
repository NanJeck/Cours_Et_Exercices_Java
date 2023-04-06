package chapitre2;

import java.util.Scanner;

public class E5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []joursDesMois= {31,28,31,30,31,30,31,31,30,31,30,31};
		Scanner sc = new Scanner(System.in);
		int mois ;
		do {
			System.out.println("Quel mois?");
			mois = sc.nextInt();
		} while (mois<1 || mois >12);
		int jour ;
		do {
			System.out.println("Quel jour?");
			jour = sc.nextInt();
		} while (jour<1 || jour > joursDesMois[mois-1]);
		System.out.println("Date valide "+jour+"/"+mois);
		int s = 0 ;
		int i = 0 ;
		while (i<mois-1) {
			s = s + joursDesMois[i++] ;
		}
		s += jour ;
		System.out.println("Nombre de jours demandé: "+s);

	}

}

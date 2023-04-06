package chapitre3;

import java.util.Scanner;

public class E3Bis {

	public static boolean controleDate(int jour, int mois) {
		int []joursDesMois= {31,28,31,30,31,30,31,31,30,31,30,31};
		if (mois <=0 || mois >12)
			return false ;
		if (jour<=0 || jour > joursDesMois[mois-1])
			return false ;
		return true ;
	}
	public static int getNbJourDebutAn(int jour, int mois) {
		int []joursDesMois= {31,28,31,30,31,30,31,31,30,31,30,31};
		int s = 0 ;
		for (int i=0; i<mois-1; i++) {
			s += joursDesMois[i] ;
		}
		s += jour ;
		return s ;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		boolean b ;
		int m ;
		int j ;
		do {
			System.out.println("Mois:");
			 m = sc.nextInt() ;
			System.out.println("Jour:");
			 j = sc.nextInt();
			b = controleDate(j,m);
			if (b==false) 
				System.out.println("Date incorrecte");
		}while (b==false);
		int nb = getNbJourDebutAn(j,m);
		System.out.println("Nombre de jours:"+nb);	
	}
}

package chapitre2;

import java.util.Scanner;

public class E5Bis {

	public static void main(String[] args) {
			// TODO Auto-generated method stub
			int []joursDesMois= {31,28,31,30,31,30,31,31,30,31,30,31};
			Scanner sc = new Scanner(System.in);
			String date ;
			String ddate[] ;
			int jour ;
			int mois ;
			do {
				do {
					System.out.println("Quelle date?");
					date = sc.nextLine();
					ddate = date.split("/");
				} while (ddate.length!=2);
				jour = Integer.parseInt(ddate[0]);
				mois = Integer.parseInt(ddate[1]);
			} while (mois<=0 || mois >12 || jour<=0 ||jour > joursDesMois[mois-1]);
			
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

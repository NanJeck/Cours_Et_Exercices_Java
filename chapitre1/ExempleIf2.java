package chapitre1;

import java.util.Scanner;

public class ExempleIf2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Saisie d'un nombre et vérification s'il est compris entre 0 et 20 inclus
		Scanner sc = new Scanner(System.in);
		System.out.println("Donner un nombre:");
		int n  = sc.nextInt();
		// 1ère solution
		if (n >= 0) {
			if (n <= 20) {
				System.out.println("Le nombre "+n+" est bien dans l'intervalle.");
			}
			else System.out.println("Le nombre est supérieur à 20");
		}
		else System.out.println("Le nombre est négatif");
		
		System.out.println("Fin du 1er test");
		// 2ème solution
		if (n>=0  && n<=20) {
			System.out.println("2.Le nombre "+n+" est bien dans l'intervalle.");
		}
		else {
			System.out.println("Le nombre n'est pas dans le bon intervalle.");
		}
		System.out.println("Fin du 2ème test");
		//3ème solution
		if (n<0 || n>20) {
			System.out.println("Le nombre n'est pas dans le bon intervalle.");
		}
		else {
			System.out.println("3.Le nombre "+n+" est bien dans l'intervalle.");
		}System.out.println("Fin du 3ème test");	
		System.out.println("n>=0 :"+(n>=0));	
		System.out.println("n=20 : "+(n<=20));	
	System.out.println("n>=0  && n<=20 : "+(n>=0  && n<=20));	
	System.out.println("n<0 || n>20 : "+(n<0 || n>20));
	}

}

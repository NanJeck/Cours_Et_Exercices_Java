package chapitre1;

import java.util.Scanner;

public class E94 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Quel est votre taille?");
		double taille = sc.nextDouble(); 
		System.out.println("Quel est votre poids?");
		double poids = sc.nextDouble(); 
		double imc = poids/(taille*taille) ;
		System.out.printf("Votre imc est de %.2f\n",imc);
		if (imc<16.5)
			System.out.println("Anorexie!!!");
		if (imc>=16.5 && imc<18.5)
			System.out.println("Maigreur, allez chez mac do");
		if (imc>=18.5 && imc < 25)
			System.out.println("Très bon, continuez!!!");
		if (imc>=25 && imc<30)
			System.out.println("Un peu plus de sport et moins de mac do");
		if (imc>=30)
			System.out.println("Trop gros!!!");
	}
}

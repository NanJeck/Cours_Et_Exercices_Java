package chapitre1;

import java.util.Scanner;

public class E92 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Quelle heure est-il?");
		int heure = sc.nextInt(); // une heure
		if (heure >= 0 && heure <= 24) {
			if (heure >= 16) {
				System.out.println("Bonsoir!");
			} else {
				System.out.println("Bonjour!");
			}
		} else
			System.out.println("Veuillez donner une heure correcte!!!!");
	}

}

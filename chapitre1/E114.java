package chapitre1;

import java.util.Scanner;

public class E114 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n ;
		do {
			System.out.println("Donnez un nombre entier:");
			n = sc.nextInt();
			if (n<10)
				System.out.println("Trop petit");
			if (n>20)
				System.out.println("Trop grand");
		}while (n<10 || n>20);
		System.out.println("Vous avez tapé "+n);
	}

}

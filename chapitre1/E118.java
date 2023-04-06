package chapitre1;

import java.util.Scanner;

public class E118 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int max = Integer.MIN_VALUE;
		int n ;
		int pos = 1 ;
		for (int i=0; i<10; i++) {
			System.out.println("Donnez l'entier de rang "+(i+1));
			n = sc.nextInt();
			if (n>max) {
				max = n;
				pos = i+1;
			}
		}
		System.out.println("Le + grand est "+max);
		System.out.println("A la position "+pos);
	}
}

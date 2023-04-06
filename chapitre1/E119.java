package chapitre1;

import java.util.Scanner;

public class E119 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int max = Integer.MIN_VALUE;
		int n ;
		int i = 0;
		int pos = 1 ;
		do {
			System.out.println("Donnez l'entier de rang "+(++i));
			n = sc.nextInt();
			if (n>max && n!=0) {
				max = n;
				pos = i;
			}
		} while (n!=0);
		System.out.println("Le + grand est "+max);
		System.out.println("A la position "+pos);
	}
}

package chapitre1;

import java.util.Scanner;

public class E117 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n ;
		System.out.println("Donnez un nombre entier:");
		n = sc.nextInt();
		int s = 0 ;
		int i = 0 ;
		while (i<n) {
			i++ ;
			s = s + i ;
		}
		System.out.println("Somme de "+n+" = "+s);
	}
}

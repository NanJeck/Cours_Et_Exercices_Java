package chapitre1;

import java.util.Scanner;

public class E116 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n ;
		System.out.println("Donnez un nombre entier:");
		n = sc.nextInt();
		System.out.println("Table de "+n);
		for (int i=1;i<=10;i++) {
			int p = n*i;
			System.out.println(n+" x "+i+" = "+p);
		}
	}
}

package chapitre1;

import java.util.Scanner;

public class E112 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Combien de bonjour par jour?");
		int n = sc.nextInt();
		for (int i=0; i<n; i++)
			System.out.println("Bonjour N°"+(i+1));
	}
}

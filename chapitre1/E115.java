package chapitre1;

import java.util.Scanner;

public class E115 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n ;
		System.out.println("Donnez un nombre entier:");
		n = sc.nextInt();
		for(int i =n+1; i<=n+10;i++) {
			System.out.print(i+" ");
		}
	}
}

package chapitre1;

import java.util.Scanner;

public class ExempleWhile1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//On veut afficher les 5 premiers nombres 1, 2, 3 ,4 et 5
		int nb = 1 ;
		while (nb < 6) {
			System.out.print(nb+" ");
			nb++;
		}
		System.out.println("\nfin du prog, nb="+nb);
	}
}

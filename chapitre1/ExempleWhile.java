package chapitre1;

import java.util.Scanner;

public class ExempleWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int nb = 0 ;
		while (nb!=1) {
			System.out.println("Saisir un nombre, 1 pour sortir");
			nb = sc.nextInt();
			System.out.println(nb!=1);
		}
		System.out.println("fin du prog, nb="+nb);
	}
}

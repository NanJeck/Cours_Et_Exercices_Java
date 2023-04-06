package chapitre3;

public class ExemplesFonctions {
	// fonctions static car appelées directement à partir du main
	public static void f() {
		System.out.println("Je suis la fonction f");
	}

	public static void afficheMessage(String message) {
		System.out.println("Message reçu:" + message);
	}

	public static void additionne(int x, int y) {
		int s = x + y;
		System.out.println("Somme calculée = " + s);
	}

	public static int additionneBis(int x, int y) {
		int s = x + y;
		return s;
	}

	public static String doubleMot(String s) {
		String r = s + s;
		return r;
	}
	

	public static void main(String[] args) {
		System.out.println("Avant l'appel de f");
		f();
		System.out.println("Après l'appel de f");
		afficheMessage("Bonjour, le contrôle est reporté");
		afficheMessage("Houlala, c'est pas terrible");
		additionne(25, 15);
		additionne(200, 300);
		int somme = additionneBis(200, 400);
		System.out.println("Valeur retournée = " + somme);
		String ch = doubleMot("Bonjour");
		System.out.println(ch);
	}
}

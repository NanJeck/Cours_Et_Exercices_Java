package chapitre2;

public class ExempleTableau {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []t = {5,-10,3,-2} ; //4 cases et c'est tout
		System.out.println(t[0]);
		System.out.println(t[1]);
		System.out.println(t[2]);
		System.out.println(t[3]);
		t[1] = 45;
		System.out.println(t[1]);
		System.out.println("Taille du tableau: "+t.length);
		for (int i=0; i<t.length; i++) {
			System.out.println("Case N°"+i+":"+t[i]);
		}
		///Autre façon
		for (int v : t)
			System.out.print(v+" ");
		System.out.println();
		//on veut afficher les 5 1ères lettres de l'alphabet
		char []tab = {'a','b','c','d','e'};
		for (char c: tab)
			System.out.print(c+" ");
	}
}

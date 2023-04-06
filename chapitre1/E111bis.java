package chapitre1;

public class E111bis {
	public static void main(String[] args) {
		int i=1;
		while (i<=5) {
			System.out.println("Bonjour N°"+i++);
			//i++;  inutile car post incrémentation
			// 1) on affiche i
			// 2) on incrémente i de 1
		}
	}
}

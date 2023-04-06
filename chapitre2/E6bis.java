package chapitre2;

public class E6bis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []t = {10,-2,5,0,-8,15,100,-12,0,5};
		System.out.println("Tableau initial");
		for (int x : t)
			System.out.print(x+" ");
		int n = 0;
		for (int i=0; i<t.length;i++) {
			if (t[i] <0) {
				int tampon = t[n];
				t[n] = t[i] ;
				t[i] = tampon ;
				n++ ;
			}
		}
		for (int i=n;i<t.length;i++) {
			if (t[i] ==0) {
				int tampon = t[n];
				t[n] = t[i] ;
				t[i] = tampon ;
				n++ ;
			}
		}

		System.out.println("\nTableau arrangé");
		for (int x : t)
			System.out.print(x+" ");

	}

}

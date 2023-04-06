package chapitre2;

public class E1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char []t = {'a','b','c','d','e','f','g','h','i','j'};
		for (char c: t)
			System.out.print(c+" ");
		System.out.println();
		///////////////////////////////
		char []t1 = new char[10] ;
		for (int i=0; i<10; i++) {
			t1[i] = (char) ('a'+ i) ;   // a -> 0x61 = 97
		}								// b ->98, c->99, d->100
		for (char c: t1)
			System.out.print(c+" ");
	}

}

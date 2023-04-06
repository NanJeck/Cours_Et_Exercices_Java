package application;

import modeles.CPoint;

public class MainCpoint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CPoint p1 = new CPoint();
		System.out.println("("+p1.getX()+":"+p1.getY()+")"+", "+p1.getCompteur());
		p1.deplacerPoint(10, 8);
		System.out.println("("+p1.getX()+":"+p1.getY()+")"+", "+p1.getCompteur());
		p1.deplacerPoint(5, -1);
		System.out.println("("+p1.getX()+":"+p1.getY()+")"+", "+p1.getCompteur());
		CPoint p2 = new CPoint(4, 5);
		System.out.println("("+p2.getX()+":"+p2.getY()+")"+", "+p2.getCompteur());
		p1.ajouter(p2);
		System.out.println("("+p1.getX()+":"+p1.getY()+")"+", "+p1.getCompteur());
		System.out.println(p1.comparer(p1)); //true
		System.out.println(p1.comparer(p2)); //false
	}

}
